package Logic1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        String aValue = String.valueOf(a);
        String bValue = String.valueOf(b);
        String sum = String.valueOf(a+b);
        int result = 0;
        if (sum.length() > bValue.length()){
            return a;
        }else {
            return a +b;
        }
    }

}
