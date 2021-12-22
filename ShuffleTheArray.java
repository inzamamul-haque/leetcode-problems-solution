package leetcode;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int odd = n;
        int even = 0;
        int[] shuffle = new int[nums.length];
        for(int i=0; i<n; i++) {
            shuffle[even] = nums[i];
            shuffle[even+1] =  nums[odd++];
            even += 2;
        }
        return shuffle;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] result = shuffleTheArray.shuffle(nums, n);
        for(int res: result) {
            System.out.println(res);
        }
    }
}
