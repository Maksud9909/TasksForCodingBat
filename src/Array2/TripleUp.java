package Array2;

public class TripleUp {
    public boolean tripleUp(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i + 1] - nums[i] == 1){
                if (i + 1 < nums.length && nums[i+2] - nums[i+1] == 1){
                    return true;
                }
            }
        }
        return false;
    }
}
