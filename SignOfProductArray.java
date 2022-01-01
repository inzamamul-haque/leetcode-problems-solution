package leetcode;

public class SignOfProductArray {
    public int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                return 0;
            }
            if(nums[i]<0) {
                count++;
            }
        }
        if (count%2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] product = {-1,-2,-3,-4,3,2,1};
        SignOfProductArray signOfProductArray = new SignOfProductArray();
        int result = signOfProductArray.arraySign(product);
        System.out.println(result);
    }
}
