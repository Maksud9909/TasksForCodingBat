package Array2;

public class Sum67 {
    public static int sum67(int[] nums) {
        boolean skipNumbers = false;
        int sum = 0;

        for (int num : nums) {
            if (num == 6) {
                skipNumbers = true;
            } else if (num == 7 && skipNumbers) {
                skipNumbers = false;
            } else if (!skipNumbers) {
                sum += num;
            }
        }

        return sum;
    }
}
