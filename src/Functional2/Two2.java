package Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Two2 {
    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().filter(integer -> integer!=2).
                map(integer -> integer*=2).filter(integer -> !Integer.toString(integer).contains("2")).collect(Collectors.toList());
    }

}
