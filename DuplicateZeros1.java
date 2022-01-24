package leetcode;

public class DuplicateZeros1 {

    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int[] res = new int[length];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (arr[index] != 0) {
                res[i] = arr[index];
            } else {
                res[i] = 0;
                if (i + 1 < length) {
                    res[i + 1] = 0;
                }
                i++;
            }
            index++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = res[i];
        }


    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        DuplicateZeros1 duplicateZeros = new DuplicateZeros1();
        duplicateZeros.duplicateZeros(arr);
    }
}
