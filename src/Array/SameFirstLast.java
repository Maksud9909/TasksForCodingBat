package Array;

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        boolean res = false;
        if (nums.length > 0){
            int first = nums[0];
            int last = nums[nums.length - 1];
            if (first == last) {
                res = true;   
            }
        } else {
            res = false;
        }
        return res;
    }

}
