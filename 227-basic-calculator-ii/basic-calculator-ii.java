class Solution {
    public int calculate(String s) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        int currentNumber = 0;
        char lastOperator = '+';
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || i == s.length() - 1) {
                if (lastOperator == '+') {
                    stack.push(currentNumber);
                } else if (lastOperator == '-') {
                    stack.push(-currentNumber);
                } else if (lastOperator == '*') {
                    stack.push(stack.pop() * currentNumber);
                } else if (lastOperator == '/') {

                    stack.push(stack.pop() / currentNumber);
                }
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    lastOperator = ch;
                }
                currentNumber = 0;

            }
        }
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }
}