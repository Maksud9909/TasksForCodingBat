package Array2;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;

                // Check if the next element is also 3
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }

}
