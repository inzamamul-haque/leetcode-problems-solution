public class FindTargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FindTargetIndices findTargetIndices = new FindTargetIndices();
        int nums[] = {1, 2, 5, 2, 3};
        int target = 2;
        System.out.println(findTargetIndices.targetIndices(nums, target));
    }
}
