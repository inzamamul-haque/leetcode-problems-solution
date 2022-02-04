package leetcode;

public class HammingDistance {

    public void bitWiseOperator() {
        int a = 2;
        /**
         * Left Shift Operator
         * Example: shift 2 by 4 means  2 * (2*4)
         **/
        System.out.println(a << 4);

        /**
         * Right Shift Operator
         * Example: shift 2 by 4 means 2 / (2*4)
         **/
        System.out.println(a >> 4);
    }

    public int hammingDistanceApproachTwo(int x, int y) {
        int result = x ^ y;
        int count = 0;
        while (result > 0) {
            count += result & 1;
            result >>= 1;
        }
        return count;
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        int result = new HammingDistance().hammingDistance(1, 4);
        int resultApproachTwo = new HammingDistance().hammingDistanceApproachTwo(1, 4);
        System.out.println(result);
        System.out.println(resultApproachTwo);
    }
}
