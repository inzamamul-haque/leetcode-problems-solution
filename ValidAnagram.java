public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char arr[] = t.toCharArray();
        Arrays.sort(arr);
        char ar[] = s.toCharArray();
        Arrays.sort(ar);
        String a = String.valueOf(arr);
        String b = String.valueOf(ar);
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        validAnagram.isAnagram(s, t);
    }

}
