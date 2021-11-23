public class ValidPalindrome {

    public static void main(String[] args) {

        String s = "madam";
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                result.append(s.charAt(i));
            }
        }

        if (result.toString().toLowerCase().equals(result.reverse().toString().toLowerCase())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
