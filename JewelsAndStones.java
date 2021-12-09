public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (char c : jewels.toCharArray()) {
            for (char s : stones.toCharArray()) {
                if (c == s) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        jewelsAndStones.numJewelsInStones(jewels, stones);
    }
}
