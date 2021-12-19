package leetcode;

public class TribonacciNumber {

    public int tribonacci(int n) {
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        int sum = 0;
        for(int i=3; i<array.length; i++) {
            array[i] =  array[i-1] + array[i-2] + array[i-3];
            sum = array[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        TribonacciNumber tribonacciNumber = new TribonacciNumber();
        tribonacciNumber.tribonacci(25);
    }
}
