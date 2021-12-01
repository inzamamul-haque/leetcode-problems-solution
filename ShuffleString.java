public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ans[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ans);

    }

    public static void main(String[] args) {
        String s = "abc";
        int[] indices = {0, 1, 2};
        ShuffleString restoreString = new ShuffleString();
        restoreString.restoreString(s,indices);
    }
}
