package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SumOfUniqueNumber {
    public int sumOfUnique(int[] nums) {
        Set<Integer> set = new HashSet<>();
        boolean[] found = new boolean[100];
        for (int i = 0; i < nums.length; i++) {
            if (found[nums[i]]) {
                set.remove(nums[i]);
            } else {
                found[nums[i]] = true;
                set.add(nums[i]);
            }
        }
        return set.stream().reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 1, 1, 5};
        SumOfUniqueNumber sumOfUniqueNumber = new SumOfUniqueNumber();
        int result = sumOfUniqueNumber.sumOfUnique(nums);
        System.out.println(result);
    }
}
