package Array;

public class Unlucky1 {
    public static void main(String[] args) {
        int arr [] = {1,23,4,5};
        System.out.println(arr[arr.length - 1]);

    }
    public boolean unlucky1(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length >= 2 && nums[0] == 1 && nums[1] == 3){
                result = true;
            }else if (nums.length >= 2 && nums[1] == 1 && nums[2] == 3 ){
                result = true;
            }else if (nums.length >= 2 && nums[nums.length - 3] == 1 && nums[nums.length - 2] == 3){
                result = true;
            }else if (nums.length >= 2 && nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3){
                result = true;
            }
        }
        return result;
    }

}
