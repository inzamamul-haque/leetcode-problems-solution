package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1346. Check If N and Its Double Exist
 **/

public class CheckNAndItsDoubleExist {

    /**
     * 1st Approach Brute Force
     **/

    public boolean checkIfExist1stApproach(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == (arr[j] * 2) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }


    /**
     * 2nd Approach Using Hashing
     **/

    public boolean checkIfExist2ndApproach(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                return true;
            }
            map.put(arr[i] * 2, i);
            if (arr[i] % 2 == 0) {
                map.put(arr[i] / 2, i);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        /**
         * Print the 1st Approach Brute Force Result
         **/
         boolean result1 = new CheckNAndItsDoubleExist().checkIfExist1stApproach(new int[]{10, 2, 5, 3});
         System.out.println(result1);


        /**
         * Print the 2nd Approach Using Hashing Result
         **/
        boolean result2 = new CheckNAndItsDoubleExist().checkIfExist2ndApproach(new int[]{7, 1, 14, 11});
        System.out.println(result2);
    }
}
