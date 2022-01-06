package leetcode;

import java.util.Arrays;

public class ArrayPairSumI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayPairSumI arrayPairSumI = new ArrayPairSumI();
        int result = arrayPairSumI.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2});
        System.out.println(result);
    }
}
