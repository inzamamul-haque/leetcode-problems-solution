public class GoalParserInterpretation {
    public String interpret(String command) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                stringBuilder.append('G');
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    stringBuilder.append('o');
                } else {
                    stringBuilder.append("al");
                }
            }
        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        GoalParserInterpretation interpret = new GoalParserInterpretation();
        interpret.interpret("G()()()()(al)");
    }
}
