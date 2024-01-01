package Logic2;

public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if (a==b){
            return c;
        } else if (a==c) {
            return b;
        } else if (b==c) {
            return a;
        }
         if ((a == b) && (b == c)){
            return 0;
        }
        else {
            return a+b+c;
        }
    }

}
