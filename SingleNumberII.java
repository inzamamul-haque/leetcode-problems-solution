import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        for (var num : count.entrySet()) {
            if (num.getValue() == 1) {
                result = num.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new SingleNumberII().singleNumber(new int[]{2, 2, 3, 2});
        System.out.println(result);
    }
}
