package leetcode;

public class CreateTargetArray {
    public int[] createTargetArray(int[] nums, int[] index) {
        boolean[] res = new boolean[nums.length];
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (res[index[i]] || target[index[i]] != 0) {
                int temp = i;
                while (temp > index[i]) {
                    target[temp] = target[temp - 1];
                    temp--;
                }
                target[index[i]] = nums[i];
            } else {
                target[index[i]] = nums[i];
                res[index[i]] = true;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        CreateTargetArray createTargetArray = new CreateTargetArray();
        int[] result = createTargetArray.createTargetArray(nums, index);
        for (int i : result) {
            System.out.println(i);
        }

    }
}
