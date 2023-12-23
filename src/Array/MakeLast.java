package Array;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        if (nums.length > 0){
            int last = nums[nums.length - 1];
            int doubleLength = nums.length * 2;
            int res [] = new int[doubleLength];
            res[res.length - 1] = last;
            return res;
        }
        else {
            return new int[]{};
        }
    }

}
