package Array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FizArray {
    public int[] fizzArray(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }


}
