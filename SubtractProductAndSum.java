public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int rem = 0;
        while (n > 0) {
            rem = n%10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }
        System.out.println(product-sum);
        return product-sum;
    }

    public static void main(String[] args) {
        int n = 234;
        SubtractProductAndSum subtractProductAndSum = new SubtractProductAndSum();
        subtractProductAndSum.subtractProductAndSum(n);
    }
}
