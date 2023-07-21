package Logic1;

public class SumLimit {
    public int sumLimit(int a, int b) {
        String aValue = String.valueOf(a);
        String bValue = String.valueOf(b);
        int result = 0;
        if (a+b > aValue.length()){
            return a;
        }else {
            return a +b;
        }
    }

}
