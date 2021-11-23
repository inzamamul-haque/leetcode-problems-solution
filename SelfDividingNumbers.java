public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isDivisible(int n) {
        int num = n;
        while (num > 0) {
            int temp = num % 10;
            if (temp == 0) {
                return false;
            }
            if (n % temp != 0) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }


    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        System.out.println(selfDividingNumbers.selfDividingNumbers(1, 22));
    }
}
