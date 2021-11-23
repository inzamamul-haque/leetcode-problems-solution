public class SingleNumber {
    public static void main(String[] args) {

        int nums[] = {4, 1, 2, 1, 2};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        set.stream().findAny().orElse(null);
    }
}
