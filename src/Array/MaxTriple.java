package Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int first = nums[0];
        int second = nums[nums.length / 2];
        int third = nums[nums.length - 1];
        int values [] = new int[]{first,second,third};
        int maxNumber = Arrays.stream(values).max().orElse(0);

        return maxNumber;
    }

}
