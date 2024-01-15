package Array2;

public class SameEnds {
    public  boolean sameEnds(int[] nums, int n) { // [1,2,3,2,1] 2
        // Check if the first n elements are the same as the last n elements
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }

}
