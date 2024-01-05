package Array;

public class MidThree {
    public int[] midThree(int[] nums) { // [1, 2, 3, 4, 5]
        if (nums.length>3){
            return new int[]{
                    nums[nums.length-2],nums[nums.length-1],nums[nums.length]
            };
        }
        return nums;
    }


}
