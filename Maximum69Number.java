package leetcode;

public class Maximum69Number {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
        StringBuilder res =  new StringBuilder();
        int temp = 0;
        for (int i=0; i<str.length(); i++) {

            if(str.charAt(i) == '6' && temp == 0) {
               res.append('9');
               temp++;
            } else {
                res.append(str.charAt(i));
            }
        }
        int result = Integer.parseInt(res.toString());
        return result;
    }

    public static void main(String[] args) {
        Maximum69Number maximum69Number = new Maximum69Number();
        maximum69Number.maximum69Number(9669);
    }
}
