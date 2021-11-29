public class FindNumber {

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digit = 0;
            while (nums[i] > 0) {
                digit++;
                nums[i] = nums[i] / 10;
            }
            if(digit%2 ==0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FindNumber findNumber = new FindNumber();

        int[] array = {12, 5, 55, 7};
         System.out.println(findNumber.findNumbers(array));
    }
}
