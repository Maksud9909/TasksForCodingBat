package LeetCode;

import java.util.Arrays;
import java.util.Objects;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int nums[] = {1,2,3,3,2};
        singleNumber.singleNumber(nums);
    }
    public int singleNumber(int[] nums) {
        Arrays.stream(nums).filter(num-> {
            if (num == nums.length - 1) {
                return num;
            }else {
                return 0;
            }
        })

        return 0;
    }
}
