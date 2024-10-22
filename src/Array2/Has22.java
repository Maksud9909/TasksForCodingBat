package Array2;

public class Has22 {


    public boolean has22(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2){
                result = true;
            }
        }
        return result;
    }
}
