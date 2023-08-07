package Array;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int begin = nums[0];
        int last = nums[nums.length - 1];
        if (begin > last){
            return new int[] {begin,begin,begin};
        }else {
            return new int[] {last,last,last};
        }
    }

}
