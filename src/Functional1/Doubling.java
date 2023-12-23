package Functional1;

import java.util.ArrayList;
import java.util.List;

public class Doubling {
    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (Integer ints: nums){
            result.add(ints * 2);
        }
        return result;
    }

}
