package Array2;

public class Has22 {


    public boolean has22(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2){
                result = true;
            }else {
                result = false;
            }
        }
        return result;
    }
    public boolean has223(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) {
                return true;
            }
        }
        return false;
    }

}
