public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {

        int[] runningSum = new int[nums.length];


        runningSum[0] = nums[0];

        int sum = runningSum[0];


        for(int i=1; i<nums.length; i++) {

            sum = sum + nums[i];

            runningSum[i] = sum;
        }

        runningSum[nums.length-1] = sum + nums[nums.length-1];

        for (int i = 0; i < runningSum.length; i++) {
            System.out.println(runningSum[i]);
        }


       return runningSum;
    }

    public static void main(String[] args) {
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        int[] array = {1,2,3,4};
        runningSumOf1dArray.runningSum(array);
    }
}
