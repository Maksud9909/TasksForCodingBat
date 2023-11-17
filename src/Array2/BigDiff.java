package Array2;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class BigDiff {
    public static void main(String[] args) {
        BigDiff bigDiff = new BigDiff();
        bigDiff.bigDiff(new int[] {1,5,4});
    }
    public int bigDiff(int[] nums) {
        int result = 0;
        int max = Arrays.stream(nums).max().orElse(0);
        int min = Arrays.stream(nums).min().orElse(0);
        result =max - min;
        return result;
    }

}
