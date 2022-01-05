package leetcode;

public class ReversePrefix {
    public String reversePrefix(String word, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        int found = 0;
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i) && found == 0) {
                stringBuilder.append(word.charAt(i));
                stringBuilder.reverse();
                found = 1;
            } else {
                stringBuilder.append(word.charAt(i));
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        String output = "dcbaefd";
        ReversePrefix reversePrefix = new ReversePrefix();
        String result = reversePrefix.reversePrefix(word, ch);
        System.out.println(result);
    }
}
