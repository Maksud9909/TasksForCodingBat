package Array;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

}


// public int[] swapEnds(int[] nums) {
//        List<Integer> integers = new ArrayList<>();
//
//        for (int i = nums.length; i > 0; i--) {
//            integers.add(nums[i]);
//        }
//        int[] intArray = integers.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//        return intArray;
//    }