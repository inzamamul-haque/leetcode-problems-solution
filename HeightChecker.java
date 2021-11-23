public class HeightChecker {

    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        int res = 0;
        Arrays.sort(expected);
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i])
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        int[] a = {5, 1, 2, 3, 4};
        System.out.println(heightChecker.heightChecker(a));
    }
}
