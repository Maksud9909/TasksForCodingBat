package Z;

public class Only14 {
    public boolean only14(int[] nums) {
        boolean res = false;
        for (int num : nums) {
            if (num != 1 || num != 4){
                res = true;
            }else {
                res = false;
            }
        }
        return res;
    }

}
