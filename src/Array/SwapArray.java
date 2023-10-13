package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SwapArray {
    public int[] swapEnds(int[] nums) {

        int[] reversedArray = IntStream.range(0, nums.length)
                .map(i -> nums[nums.length - 1 - i])
                .toArray();
        return reversedArray;
    }

}
