package Array2;

import java.util.ArrayList;
import java.util.List;

public class FizArray2 {
    public String[] fizzArray2(int n) {
        String [] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = String.valueOf(i);
        }
        return result;
    }

}
