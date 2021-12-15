package leetcode;

public class CheckTwoStringAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String concatWord1 = "";
        String concatWord2 = "";

        for (String str: word1) {
            concatWord1 = concatWord1 + str;
        }

        for (String str: word2) {
            concatWord2 = concatWord2 + str;
        }

        if(concatWord1.equals(concatWord2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        CheckTwoStringAreEquivalent checkTwoStringAreEquivalent = new CheckTwoStringAreEquivalent();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        checkTwoStringAreEquivalent.arrayStringsAreEqual(word1, word2);

    }
}
