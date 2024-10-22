package Array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int num : nums) {
            if (num == 6) {
                ignore = true; // Start ignoring numbers
            }

            if (!ignore) {
                sum += num; // Add numbers that are not in the ignore section
            }

            if (num == 7 && ignore) {
                ignore = false; // Stop ignoring after encountering a 7
            }
        }

        return sum;
    }

}
