package leetcode;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        int max = 0;
        for (int candy : candies) {
            if (max < candy) {
                max = candy;
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        kidsWithCandies kidsWithCandies = new kidsWithCandies();
        List<Boolean> result = kidsWithCandies.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
