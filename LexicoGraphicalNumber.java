package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LexicoGraphicalNumber {
    public List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            list.add(i + "");
        }
        Collections.sort(list);

        List<Integer> LexicographicalNumber = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            LexicographicalNumber.add(Integer.valueOf(list.get(i)));
        }
        return LexicographicalNumber;
    }

    public static void main(String[] args) {
        List<Integer> solution = new LexicoGraphicalNumber().lexicalOrder(13);
        System.out.println(solution);
    }
}
