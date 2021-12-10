package leetcode;

public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] nums) {
        int temp[] = new int[nums.length];
        int evenNumber = 0;
        int oddNumber = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                temp[evenNumber] = nums[i];
                evenNumber = evenNumber + 2;
            } else {
                temp[oddNumber] = nums[i];
                oddNumber = oddNumber + 2;
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        SortArrayByParityII sortArrayByParityII = new SortArrayByParityII();
        int[] result = sortArrayByParityII.sortArrayByParityII(new int[]{4, 2, 5, 7});

        for (int res : result) {
            System.out.println(res);
        }
    }
}
