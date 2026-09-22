class Solution {
    public boolean isPowerOfTwo(int n) {

        long x = 1;

        while (x <= n) {
            if (x == n) {
                System.out.println((x % 2 == 0) ? "True" : "False");
                return true;
                
            }
            x = x * 2;
        }
        return false;

    }
}