 class Solution {
    public int minimumSum(int num) {
        int num1 = 0;
        int num2 = 0;

        int a = num / 1000;
        int b = (num / 100) % 10;
        int c = (num / 10) % 10;
        int d = num % 10;

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (a > d) {
            int temp = a;
            a = d;
            d = temp;
        }

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        if (b > d) {
            int temp = b;
            b = d;
            d = temp;
        }

        if (c > d) {
            int temp = c;
            c = d;
            d = temp;
        }

        num1 = a * 10 + c;
        num2 = b * 10 + d;

        return num1 + num2;
    }
}