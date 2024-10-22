package Z;

public class Test1 {
    public boolean sum28(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num == 2) {
                res += num;
            }
        }
        return res == 8;
    }

}
