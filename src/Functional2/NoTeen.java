package Functional2;

import java.util.List;

public class NoTeen {
    public List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(integer -> 12<integer && integer<20);
        return nums;
    }

}
