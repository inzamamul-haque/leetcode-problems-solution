import java.util.ArrayList;
import java.util.List;

public class CountEven {
    public int countEven(int num) {
        List<Integer> count = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (i < 10 && i % 2 == 0) {
                count.add(i);
            } else if (i >= 10) {
                int sum = 0;
                int temp = i;
                while (temp > 0) {
                    int rem = temp % 10;
                    sum += rem;
                    temp /= 10;
                }
                if (sum % 2 == 0) {
                    count.add(i);
                }
            }
        }
        return count.size();
    }

    public static void main(String[] args) {
        int res = new CountEven().countEven(30);
        System.out.println(res);
    }
}
