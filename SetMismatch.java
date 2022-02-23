import java.util.HashMap;
import java.util.Map;

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int missingNumber = 0;
        int duplicateNumber = 0;
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    duplicateNumber = i;
                }
            } else {
                missingNumber = i;
            }
        }
        return new int[]{duplicateNumber, missingNumber};
    }

    public static void main(String[] args) {
        int[] results = new SetMismatch().findErrorNums(new int[]{3, 2, 3, 4, 6, 5});
        for (var res : results) {
            System.out.println(res);
        }
    }
}
