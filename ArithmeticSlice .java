public class ArithmeticSlice {
    public int numberOfArithmeticSlices(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i - 1] - nums[i - 2] == nums[i] - nums[i - 1]) {
                count++;
                sum += count;
            } else {
                count = 0;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int res = new ArithmeticSlice().numberOfArithmeticSlices(new int[]{1, 2, 3, 4});
        System.out.println(res);
    }
}
