import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new MajorityElement().majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(result);
    }
}
