public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for( i = 0; i<nums.length; i++) {
            if(nums[i] != i) {
                return i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        MissingNumber missingNumber = new MissingNumber();
        int result = missingNumber.missingNumber(nums);
        System.out.println(result);
    }
}
