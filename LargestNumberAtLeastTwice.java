package leetcode;

public class LargestNumberAtLeastTwice {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && (nums[i] * 2) > max) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int result = new LargestNumberAtLeastTwice().dominantIndex(new int[]{3, 6, 1, 0});
        System.out.println(result);
    }
}
