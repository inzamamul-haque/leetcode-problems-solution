package leetcode;

public class XorOperationInArray {
    public int xorOperation(int n, int start) {
        int nums[] = new int[n];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
            result ^= nums[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        XorOperationInArray xorOperationInArray = new XorOperationInArray();
        int result = xorOperationInArray.xorOperation(5, 0);
        System.out.println(result);
    }
}
