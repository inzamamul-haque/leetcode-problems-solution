public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int length = nums.length-1;
        int[] temp = new int[nums.length];
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]%2==0) {
                temp[count++] = nums[i];
            } else {
                temp[length--] = nums[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int [] result = sortArrayByParity.sortArrayByParity(nums);
        for (int res: result) {
            System.out.print(res);
        }

    }
}
