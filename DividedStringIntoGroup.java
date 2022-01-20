package leetcode;

public class DividedStringIntoGroup {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int size = (n + k - 1) / k;
        String[] ans = new String[size];
        int i = 0;
        String temp = "";
        int j = 0;
        while (i < n) {
            if (temp.length() < k) {
                temp += s.charAt(i);
                i++;
            } else if (temp.length() == k) {
                ans[j] = temp;
                j++;
                temp = new String();
            }
        }

        ans[j] = temp;
        temp = ans[size - 1];

        if (temp.length() != k) {
            n = temp.length();
            j = k - n;
            while (j-- > 0) {
                temp += fill;
            }
            ans[size - 1] = temp;
        }

        return ans;
    }


    public static void main(String[] args) {
        DividedStringIntoGroup dividedStringIntoGroup = new DividedStringIntoGroup();
        String[] value = dividedStringIntoGroup.divideString("abcdefghi", 74, 'b');
        for (String val : value) {
            System.out.println(val);
        }
    }
}
