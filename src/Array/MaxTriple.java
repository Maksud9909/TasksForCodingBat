package Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        return max;
    }

}
