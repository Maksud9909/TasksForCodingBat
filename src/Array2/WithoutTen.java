package Array2;

import java.util.Arrays;

public class WithoutTen {
    public static void main(String[] args) {
        WithoutTen withoutTen = new WithoutTen();
        int [] arr = {1,10,23,10};
        withoutTen.withoutTen(arr);
    }
    public int[] withoutTen(int[] nums) {
        int i = 0;

        while(i < nums.length && nums[i] != 10)
            i++;

        for(int j = i + 1; j < nums.length; j++) {
            if(nums[j] != 10) {
                nums[i] = nums[j];
                nums[j] = 10;
                i++;
            }
        }

        for( ; i < nums.length; i++)
            nums[i] = 0;

        return nums;
    }
}
