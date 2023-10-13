package Array;

public class Double23 {
    public boolean double23(int[] nums) {
        boolean result = false;
        if (nums.length <=1){
            result = false;
        } else if ((nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}