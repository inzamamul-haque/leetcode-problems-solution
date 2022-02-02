package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicate {
    public List findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var res = new FindAllDuplicate().findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        System.out.println(res);
    }
}
