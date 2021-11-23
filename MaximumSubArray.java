public class MaximumSubArray {
    /*
     *  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     *  Output: 6
     *  Explanation: [4,-1,2,1] has the largest sum = 6.
     *
     */

    public int maxSubArray(int[] nums) {

       int max = nums[0];
       int sum = 0;

       for(int i=0; i<nums.length; i++) {
           sum = sum + nums[i];
           if(max<sum) {
               max = sum;
           }
           if(sum<0) {
               sum = 0;
           }
       }
       return max;

    }

    public static void main(String[] args) {
        MaximumSubArray ob = new MaximumSubArray();
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(ob.maxSubArray(a));
    }
}
