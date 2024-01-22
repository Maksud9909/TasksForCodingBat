package Array2;

public class GetUnlucky13 {

        public static int sum13(int[] nums) {
            // Check if the array is empty
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int total = 0;
            int i = 0;

            while (i < nums.length) {
                // If the current number is 13, skip it and the next number
                if (nums[i] == 13) {
                    i += 2;
                } else {
                    total += nums[i];
                    i++;
                }
            }

            return total;
        }
    }

