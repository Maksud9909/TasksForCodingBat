package Array;

public class Fix23 {
    public int[] fix23(int[] nums) {
        int [] arr = new int[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i+1] == 3){
                arr = nums;
                arr[i+1] = 0;
                break;
            }else {
                arr = nums;
            }
        }
        return arr;
    }

}
