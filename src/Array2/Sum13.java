package Array2;

public class Sum13 {
    public static int getUnluckySum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                // Skip the number 13 and the number immediately following it
                i++;
            } else {
                sum += nums[i];
            }
        }

        return sum;
    }
}



