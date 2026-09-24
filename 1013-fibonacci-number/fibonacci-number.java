class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int ans = 0;
        int a = 0;
        int b = 1;
        int i = 1;

        do {
            ans = b;
            
            b = a + b;
            a = ans;
            i++;
        } while (i <= n);

        return ans;
    }
}