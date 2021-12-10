package leetcode;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] temp = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    found = true;
                } else {
                    if (found) {
                        if (nums1[i] < nums2[j]) {
                            temp[i] = nums2[j];
                            break;
                        } else {
                            temp[i] = -1;
                        }
                    } else {
                        temp[i] = -1;
                    }

                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        int[] result = nextGreaterElement.nextGreaterElement(nums1, nums2);

        for (int i : result) {
            System.out.println(i);
        }

    }
}
