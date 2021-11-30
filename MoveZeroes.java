public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int lastIndex = nums.length-1;
        int count = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        while(count<=lastIndex) {
            nums[lastIndex--] = 0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        moveZeroes.moveZeroes(nums);
    }

}
