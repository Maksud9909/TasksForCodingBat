package Array2;

import java.util.Arrays;

public class Post4 {
    public int[] post4(int[] nums) {
        int index4 = -1;

        // Find the index of the last occurrence of 4
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                index4 = i;
                break; // Found the last 4, exit the loop
            }
        }

        // Create a new array with elements after the last 4
        int[] result = Arrays.copyOfRange(nums, index4 + 1, nums.length);

        return result;
    }

}
