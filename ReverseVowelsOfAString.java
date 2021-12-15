package leetcode;

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = ch[i];
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c  == 'o' || c == 'O' || c  == 'u' || c == 'U') {
                stringBuilder.append(c);
            }
        }
        for (int i = 0, j=0; i < s.length(); i++) {
            char c = ch[i];
            if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c  == 'o' || c == 'O' || c  == 'u' || c == 'U') {
                ch[i] = stringBuilder.charAt(j++);
            }
        }

        return String.valueOf(ch);
    }

    public static void main(String[] args) {
        ReverseVowelsOfAString reverseVowelsOfAString = new ReverseVowelsOfAString();
        String str = reverseVowelsOfAString.reverseVowels("hello");
        System.out.println(str);
    }
}
