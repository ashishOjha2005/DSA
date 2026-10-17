 class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String result = "";
        String base = strs[0];

        for (int i = 0; i < base.length(); i++) {
            for (String word : strs) {
                if (i == word.length() || word.charAt(i) != base.charAt(i)) {
                    return result;
                }
            }
            result += base.charAt(i);
        }

        return result;
    }
}