package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCode {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : word.toCharArray()) {

                /**
                 *  Ascii value of A is 65, for A (65-65) = 0 
                 *  that means A morse code found in 0 index, for B (66-65) = 1 index
                 * */

                stringBuilder.append(morseCode[c - 'a']);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = new UniqueMorseCode().uniqueMorseRepresentations(words);
        System.out.println(result);
    }
}
