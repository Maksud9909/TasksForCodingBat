package Array;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int begin = nums[0];
        int end = nums[nums.length - 1];
        return new int[] {begin,end};
    }

}
