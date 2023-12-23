package Array;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        int second = nums[1];
        int third = nums[2];
        return new int[]{second,third,first};
    }

}
