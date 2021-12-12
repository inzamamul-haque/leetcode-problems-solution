public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        for(int i= s.length()-1; i>=0; i--) {
            if(Character.isAlphabetic(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }

        for(int i= 0; i<s.length(); i++) {
            if(!Character.isAlphabetic(s.charAt(i))) {
                stringBuilder.insert(i, s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();
        String str = reverseOnlyLetters.reverseOnlyLetters("ab-cd");
        System.out.println(str);
    }
}
