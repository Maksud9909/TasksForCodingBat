package Array;

import java.util.Arrays;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        if (sumB>sumA){
            return b;
        }else {
            return a;
        }
    }

}
