package leetcode;

public class FindFirstUniqueCharacter {
    public int findFirstUniqueCh(String s) {
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            int found = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s  = "loveleetcode";
        FindFirstUniqueCharacter findFirstUniqueCharacter = new FindFirstUniqueCharacter();
        int result = findFirstUniqueCharacter.findFirstUniqueCh(s);
        System.out.println(result);
    }

}
