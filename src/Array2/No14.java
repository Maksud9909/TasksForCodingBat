package Array2;

public class No14 {
    public boolean no14(int[] nums) {
        for (int num:nums){
            if (num==1 || num==4){
                if (num==4 || num==1){
                    return false;
                }
            }
        }
        return true;
    }

}
