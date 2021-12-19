package leetcode;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        int count = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ans = nums[i];
            }
            if (ans == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 2, 2};
        MajorityElement majorityElement = new MajorityElement();
        majorityElement.majorityElement(nums);
    }
}
