package Array2;

public class Lucky13 {
    public boolean lucky13(int[] nums) {
        boolean res = true;
        for (int num:nums){
            if (num == 1 || num == 3){
                res = false;
            }
        }
        return res;
    }

}
