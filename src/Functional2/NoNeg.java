package Functional2;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;

public class NoNeg {
    public List<Integer> noNeg(List<Integer> nums) {
        List<Integer> list = new ArrayList<>();
        nums.forEach(integer -> {
            if (integer>-1){
                list.add(integer);
            }
        });
        return list;
    }

}
