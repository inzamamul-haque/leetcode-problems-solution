public class AddDigits {
    public int addDigits(int num) {
        int res = 0;
        while (num > 0) {
            int rem = num % 10;
            res = res + rem;
            num = num / 10;
        }
        if (res > 9) {
            return addDigits(res);
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 38;
        AddDigits addDigits = new AddDigits();
        int result = addDigits.addDigits(num);
        System.out.println(result);
    }
}
