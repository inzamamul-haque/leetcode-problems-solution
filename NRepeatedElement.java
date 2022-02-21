import java.util.HashMap;
import java.util.Map;

public class NRepeatedElement {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        for (var num : map.entrySet()) {
            if (num.getValue() > 1) {
                result = num.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int res = new NRepeatedElement().repeatedNTimes(new int[]{1, 3, 3});
        System.out.println(res);
    }
}
