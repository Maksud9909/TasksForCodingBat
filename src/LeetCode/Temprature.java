package LeetCode;

public class Temprature {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius +273.15;
        double farengeyt = celsius * 1.80 + 32;
        return new double[] {kelvin,farengeyt};
    }
}
