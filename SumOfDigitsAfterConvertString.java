package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfDigitsAfterConvertString {
    public int getLucky(String s, int k) {
        Map<Character, Integer> map = new HashMap();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);

        String sumOfString = "";
        for (Character ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                sumOfString += map.get(ch);
            }
        }
        int sum = 0;
        int result = 0;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < sumOfString.length(); j++) {
                sum += sumOfString.charAt(j) - '0';
            }
            sumOfString = String.valueOf(sum);
            result = sum;
            sum = 0;
        }
        return result;
    }


    public static void main(String[] args) {
        SumOfDigitsAfterConvertString sumOfDigitsAfterConvertString = new SumOfDigitsAfterConvertString();
        int result = sumOfDigitsAfterConvertString.getLucky("fleyctuuajsr", 5);
        System.out.println(result);
    }

}
