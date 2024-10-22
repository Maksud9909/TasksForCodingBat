package Z;

public class More14 {
    public boolean more14(int[] nums) {
        int ones = 0;
        int forth = 0;
        for (int num:nums){
            if (num == 1){
                ones++;
            } else if (num == 4) {
                forth++;
            }
        }
        return ones > forth;
    }

}
