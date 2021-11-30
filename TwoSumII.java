public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        for (int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i] + numbers[j] == target) {
                    return new int[] {i+1,j+1};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int[] numbers = {-1,0};
        int target = -1;
        twoSumII.twoSum(numbers, target);
    }
}
