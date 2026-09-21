class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int multiply = 1;
        int add = 0;

        while (temp > 0) {
            int digit = temp % 10;

            multiply = multiply * digit;
            add = add + digit;

            temp = temp / 10;
        }

        int result = multiply - add;

        System.out.println("Multiplication = " + multiply);
        System.out.println("Addition = " + add);
        System.out.println("Result = " + result);

        return result;
    }

}
