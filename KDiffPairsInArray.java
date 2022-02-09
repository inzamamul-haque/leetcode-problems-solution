package leetcode;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInArray {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        System.out.println(map);

        for (int num : map.keySet()) {
            if (k > 0 && map.containsKey(num + k) || (k == 0 & map.get(num) > 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int res = new KDiffPairsInArray().findPairs(new int[]{3, 1, 4, 1, 5}, 2);
        System.out.println(res);
    }
}
