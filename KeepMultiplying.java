package leetcode;

import java.util.Arrays;

public class KeepMultiplying {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (original == nums[i]) {
                original = original * 2;
            }
        }
        return original;
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
        KeepMultiplying keepMultiplying = new KeepMultiplying();
        int result = keepMultiplying.findFinalValue(nums, original);
        System.out.println(result);

    }
}
