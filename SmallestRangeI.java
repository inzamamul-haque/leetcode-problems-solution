package leetcode;

public class SmallestRangeI {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int smallest = 0;
        smallest = (max - k) - (min + k);

        if (smallest < 0) {
            return 0;
        }

        return smallest;
    }

    public static void main(String[] args) {
        SmallestRangeI smallestRangeI = new SmallestRangeI();
        int result = smallestRangeI.smallestRangeI(new int[]{0, 10}, 2);
        System.out.println(result);
    }
}
