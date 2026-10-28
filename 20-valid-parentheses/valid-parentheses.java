
class Solution {
    public boolean isValid(String s) {
        String i = "";

        for (int j = 0; j < s.length(); j++) {
            i += s.charAt(j);

            if (i.endsWith("()") || i.endsWith("{}") || i.endsWith("[]")) {
                i = i.substring(0, i.length() - 2);
            }
        }

        return i.isEmpty();
    }
}
