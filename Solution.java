class Solution {
    public int firstUniqChar(String s) {
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            int found = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    found = 1;
                    break;
                } else {
                    continue;
                }
            }
            if (found == 0) {
                result = i;
                break;
            }
        }
        return result; 
    }
}
