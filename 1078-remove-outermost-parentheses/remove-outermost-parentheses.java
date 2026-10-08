 class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;

                if (count > 1) {
                    result += ch;
                }
            } 
            else {
                if (count > 1) {
                    result += ch;
                }

                count--;
            }
        }

        return result;
    }
}