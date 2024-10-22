package Array2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        List<Integer> listEven = new ArrayList<>();
        List<Integer> listOdd = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                listEven.add(num);
            } else {
                listOdd.add(num);
            }
        }
        listEven.addAll(listOdd);
        return listEven.stream().mapToInt(Integer::intValue).toArray();
    }
}
