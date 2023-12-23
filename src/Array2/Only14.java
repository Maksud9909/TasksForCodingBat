package Array2;

public class Only14 {
    public boolean only14(int[] nums) {
        boolean res = true;
        for (int num:nums){
            if (num!=1){
                res = false;
            }
        }
        return res;
    }

}
