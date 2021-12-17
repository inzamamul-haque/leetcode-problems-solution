package leetcode;

public class CheckPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {

        CheckPerfectNumber checkPerfectNumber = new CheckPerfectNumber();
        boolean result = checkPerfectNumber.checkPerfectNumber(6);
        System.out.println(result);
    }
}
