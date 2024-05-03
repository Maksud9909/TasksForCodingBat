package Logic2;

public class NoTeenSum {
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }


    public int fixTeen(int n) {
        int arr [] = new int[]{13,14,17,18,19};
        for (int ar:arr){
            if (n==ar){
                return 0;
            }
        }
        return n;
    }


}
