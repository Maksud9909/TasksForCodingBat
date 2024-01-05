package Recursion1;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.factorial(10);
    }
    public int factorial(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result*=i;
        }
        return result;
    }

}
