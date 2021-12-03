public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = n + m;
        int temp[] = nums1;
        int index = length-1;
        for(int i=0; i<=length-1; i++) {
            if(m>0) {
                nums1[i] = temp[i];
                m--;
            }
            if(n>0) {
                nums1[index--] = nums2[i];
                n--;
            }
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(nums1,m,nums2,n);
    }
}
