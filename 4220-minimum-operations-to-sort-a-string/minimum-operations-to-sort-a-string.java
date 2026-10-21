class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int min_c = 0, max_c = 0;

        if (isSorted(s))
            return 0;
        if (n == 2)
            return -1;

        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) < s.charAt(min_c))
                min_c = i;

            if (s.charAt(i) >= s.charAt(max_c))
                max_c = i;
        }

        if (min_c == 0 || max_c == n - 1)
            return 1;

        return (min_c == n - 1 && max_c == 0) ? 3 : 2;
    }

    private boolean isSorted(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1))
                return false;
        }
        return true;
    }
}
