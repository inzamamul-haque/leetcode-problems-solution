package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CountTheNumberOfConsistent {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()) {
            set.add(c);
        }
        int count = 0;
        for (String word: words) {
            boolean found = true;
            for (char ch: word.toCharArray()) {
                if (!set.contains(ch)) {
                    found = false;
                    break;
                }
            }
            if(found) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        CountTheNumberOfConsistent countTheNumberOfConsistent = new CountTheNumberOfConsistent();
        countTheNumberOfConsistent.countConsistentStrings(allowed, words);
    }
}
