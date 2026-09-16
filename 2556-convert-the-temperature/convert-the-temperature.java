class Solution {
    public double[] convertTemperature(double celsius) {
        double ans = celsius + 273.15;
        double result = celsius * 1.80 + 32.00;

        return new double[] { ans, result };

    }
}