package Functional2;

import java.sql.ClientInfoStatus;
import java.util.List;

public class No9 {
    public List<Integer> no9(List<Integer> nums) {
        nums.removeIf(integer -> integer%10==9);
        return nums;
    }

}
