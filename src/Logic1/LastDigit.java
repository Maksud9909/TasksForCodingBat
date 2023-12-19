package Logic1;

public class LastDigit {
    public boolean lastDigit(int a, int b, int c) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;

        return (lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC);
    }

}
