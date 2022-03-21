import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int lastIndex[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        int startIndex = 0;
        int maxIndex = 0;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            maxIndex = Math.max(maxIndex, lastIndex[s.charAt(i) - 'a']);
            if (i == maxIndex) {
                ans.add(i - startIndex + 1);
                startIndex = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        var result = new PartitionLabels().partitionLabels("abedae");
        System.out.println(result);
    }
}
