package Warmup2;

public class Has271 {
    public boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 2 || nums[i] == 3 || nums [i] == 1){
                if (nums[i+1] == 7 || nums[i+1] == 6 || nums[i+1] == 8){
                    if (nums[i+2] == 1 || nums[i+2] == 0 || nums[i] == 2){
                        return true;
                    }
                }
            }
        }
        return false;
    }

}

