class Solution {
    public int minAddToMakeValid(String s) {
        int unmatchedOpen = 0;
        int unmatchedClose = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {

                unmatchedOpen++;
            } else if (c == ')') {

                if (unmatchedOpen > 0) {

                    unmatchedOpen--;
                } else {

                    unmatchedClose++;
                }
            }
        }

        int result = unmatchedOpen + unmatchedClose;
        return result;
    }
}
