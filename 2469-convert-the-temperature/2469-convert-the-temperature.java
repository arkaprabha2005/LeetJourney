class Solution {
    public double[] convertTemperature(double celsius) {
        double[] arr={celsius+273.15,celsius*1.80+32};
        return arr;
    }
}