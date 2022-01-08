package leetcode;

public class HappyNumber {
    public boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        }
        while (n >= 10) {
            n = squareOfDigits(n);
        }
        return n == 1 || n == 7;
    }

    public static int squareOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int rem = (number % 10) * (number % 10);
            sum += rem;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        boolean result = happyNumber.isHappy(17);
        System.out.println(result);
    }
}

