package Array2;

public class ModThree {
    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 !=0 || (nums[i+1] % 2 != 0 || i + 2 < nums.length && nums[i+1] % 2 !=0) ||
            (nums[i+2] % 2 != 0 || i + 3 < nums.length && nums[i+1] % 2 !=0) ){
                return false;
            }
        }
        return true;
    }

}


class Test {
    public boolean modThree(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) ||
                    (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1)) {
                return true;
            }
        }
        return false;
    }


}