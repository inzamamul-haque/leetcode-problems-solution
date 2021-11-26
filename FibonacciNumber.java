public class FibonacciNumber {

    public int fib(int n) {

        int n1 = 0;
        int n2 = 1;
        int result = 0;

        if(n == 0) { return 0;}
        if(n == 1) { return 1;}
        if(n == 2) { return 1;}

        for(int i=2; i<=n; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }

        return result;

    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();

        System.out.println(fibonacciNumber.fib(5));
    }
}
