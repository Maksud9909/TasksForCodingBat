package Array;

import java.util.Arrays;

public class No23 {
    public boolean no23(int[] nums) {
        boolean res = false;
        for (int num:nums){
            if (num == 2 || num == 3){
                res =  false;
            }
        }
        return res;
    }

}
