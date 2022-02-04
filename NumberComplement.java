package leetcode;

import java.util.Stack;

public class NumberComplement {

    public int findComplement(int num) {
        Stack<Integer> st = new Stack<>();
        while (num > 0) {
            st.push(num % 2);
            num = num / 2;
        }

        Stack<Integer> onesComplement = new Stack<>();

        for (int i = 0; i < st.size(); i++) {
            if (st.get(i) == 0) {
                onesComplement.push(1);
            } else {
                onesComplement.push(0);
            }
        }

        int result = 0;
        for (int i = 0; i < onesComplement.size(); i++) {
            result += onesComplement.get(i) * Math.pow(2, i);
        }
        return result;
    }


    public static void main(String[] args) {
        int result = new NumberComplement().findComplement(5);
        System.out.println(result);

    }
}
