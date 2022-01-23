package leetcode;

/**
 2120. Execution of All Suffix Instructions Staying in a Grid
 **/

public class ExecuteInstructions {
    public int[] executeInstructions(int n, int[] startPos, String s) {

        int[] result = new int[s.length()];

        for(int i=0; i<s.length(); i++) {

           int x = startPos[0];
           int y = startPos[1];
           int moves = 0;

           for (int j=i; j<s.length(); j++) {

               if(s.charAt(j) == 'U') {
                   x--;
               }

               if(s.charAt(j) == 'D') {
                   x++;
               }

               if(s.charAt(j) == 'L') {
                   y--;
               }

               if(s.charAt(j) == 'R') {
                   y++;
               }

               if(x < 0 || y < 0 || x >= n || y >= n) {
                   break;
               } else {
                  moves++;
               }

           }

           result[i] = moves;

        }

        return result;

    }

    public static void main(String[] args) {
       int n = 3;
       int[] startPos = {0,1};
       String s = "RRDDLU";
       ExecuteInstructions executeInstructions = new ExecuteInstructions();
       int[] result = executeInstructions.executeInstructions(n, startPos, s);

       for(int res: result) {
           System.out.println(res);
       }
    }
}
