public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int s1 = 0;
        int t1 = 0;

        for(int i = 0; i < s.length(); i++){
            s1 += s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            t1 += t.charAt(i);
        }
        int diff = t1-s1;
        char res = (char) diff;
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
       String s = "abcd";
       String t = "abcde";
       FindTheDifference findTheDifference = new FindTheDifference();
       findTheDifference.findTheDifference(s, t);
    }
}
