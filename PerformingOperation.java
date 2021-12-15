package leetcode;

public class PerformingOperation {
    public int finalValueAfterOperations(String[] operations) {

        int result = 0;
        for(String operation: operations) {
            if (operation.equals("--X")  || operation.equals("X--")) {
                result = result -1;
            } else {
                result = result + 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        PerformingOperation performingOperation = new PerformingOperation();
        performingOperation.finalValueAfterOperations(operations);
    }
}
