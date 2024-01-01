package Logic2;

import java.util.Map;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;

        return (max - mid) == (mid - min);
    }

}
