package leetcode;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int a = 0;
        int b = 0;

        while (a < g.length && b < s.length) {
            if (g[a] <= s[b]) {
                a++;
            }
            b++;

        }
        return a;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3}, s = {1, 2, 3};
        int result = new AssignCookies().findContentChildren(g, s);
        System.out.println(result);
    }
}
