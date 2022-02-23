public class ThreeConsecutiveIntegers {
    public long[] sumOfThree(long num) {
        if (num % 3 != 0) {
            return new long[0];
        }
        long result = num / 3 - 1;
        return new long[]{result, result + 1, result + 2};
    }

    public static void main(String[] args) {
        long[] results = new ThreeConsecutiveIntegers().sumOfThree(33);
        for (long res : results) {
            System.out.println(res);
        }
    }
}
