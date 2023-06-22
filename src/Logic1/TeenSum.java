package Logic1;

public class TeenSum {
    public int teenSum(int a, int b) {
        int result = a + b;
        int numberResult [] = {13,14,15,16,17,18,19};
        for (int n: numberResult) {
            if (n==a || n==b){
                result =  19;
            }
        }
        return result;
    }

}
