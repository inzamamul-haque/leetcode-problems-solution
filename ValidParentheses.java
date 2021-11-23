class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack stack = new Stack();

        for (Character character : s.toCharArray()) {
            if (map.containsKey(character)) {
                stack.push(character);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (character == map.get(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }
}
