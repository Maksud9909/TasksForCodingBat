package Array2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        int maxOddNumber = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i] = maxOddNumber;
            } else if (nums[i] % 2 != 0) {
                if (nums[i] > maxOddNumber){
                    maxOddNumber = nums[i];
                }
            }
        }
        return nums;
    }
}
