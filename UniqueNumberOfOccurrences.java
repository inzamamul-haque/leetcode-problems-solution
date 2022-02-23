import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (var num : map.values()) {
            if (set.contains(num)) {
                return false;
            } else {
                set.add(num);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean result = new UniqueNumberOfOccurrences().uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3});
        System.out.println(result);
    }
}
