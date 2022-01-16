package leetcode;

public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        int res = 0;
        while (n > 1) {
            int temp = n;
            n = n / 2;
            res += temp - n;
        }
        return res;
    }

    public static void main(String[] args) {
        CountOfMatchesInTournament countOfMatchesInTournament = new CountOfMatchesInTournament();
        int res = countOfMatchesInTournament.numberOfMatches(7);
        System.out.println(res);
    }
}
