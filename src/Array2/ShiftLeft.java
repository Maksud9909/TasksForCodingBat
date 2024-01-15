package Array2;

import java.util.Arrays;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {



        if (nums.length > 1){
            for (int i = 0; i < nums.length; i++) {
                int first = nums[0];
                nums[1] = first;
                nums[0] = nums[1];
            }
        }
        return nums;
    }
}
