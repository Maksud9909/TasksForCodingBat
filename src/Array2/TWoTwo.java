package Array2;

public class TWoTwo {
    public boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {


                if (i + 1 < nums.length && nums[i+1] == 2){
                    return true;
                }
            }
        }
        return false;
    }

}
