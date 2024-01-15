package Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Square56 {
    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(integer -> (integer*integer)+10).filter(integer -> !Integer.toString(integer).endsWith("5")).
                filter(integer -> !Integer.toString(integer).endsWith("6")).collect(Collectors.toList());
    }

}
