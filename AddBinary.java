package leetcode;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }

        if (carry == 1) {
            res.append(1);
        }

        return res.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String res = addBinary.addBinary("1010", "1011");
        System.out.println(res);
    }
}
