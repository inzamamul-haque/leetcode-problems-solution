package leetcode;

public class DoubleReversal {
    public boolean isSameAfterReversals(int num) {
        int temp = num;
        int res = 0;
        int newNumber = 0;

        while (num > 0) {
            int rem = num % 10;
            res = rem + res * 10;
            num /= 10;
        }

        while (res > 0) {
            int rem = res % 10;
            newNumber = rem + newNumber * 10;
            res /= 10;
        }

        if (newNumber == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        DoubleReversal doubleReversal = new DoubleReversal();
        boolean result = doubleReversal.isSameAfterReversals(609576);
        System.out.println(result);
    }
}
