package leetcode;

import java.util.Arrays;

public class GetMaximumGeneratedArray {
    public int getMaximumGenerated(int n) {
        if(n == 0) {
            return 0;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for(int i=2; i<=n; i++) {
            if(i%2 == 0) {
                nums[i] = nums[i/2];
            } else {
                int divide = i/2;
                nums[i] = nums[divide] + nums[i-divide];
            }
        }
        Arrays.sort(nums);
        return nums[nums.length-1];

    }

    public static void main(String[] args) {
        GetMaximumGeneratedArray getMaximumGeneratedArray = new GetMaximumGeneratedArray();
        int result = getMaximumGeneratedArray.getMaximumGenerated(7);
        System.out.println(result);
    }
}
