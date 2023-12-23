package Array2;

public class More14 {
    public boolean more14(int[] nums) {
        int count4 = 0;
        int count1 = 0;
        for (int num:nums){
            if (num == 4){
                count4++;
            } else if (num == 1) {
                count1++;
            }
        }
        if (count1 > count4){
            return true;
        }else {
            return false;
        }
    }

}
