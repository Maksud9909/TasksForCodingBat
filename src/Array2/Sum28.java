package Array2;

public class Sum28 {
    public static void main(String[] args) {
        Sum28 sum28 = new Sum28();
        int arr [] = {2, 2, 2, 2, 2};
        sum28.sum28(arr);
    }
    public boolean sum28(int[] nums) {
        int sum = 0;
        boolean res = false;

        for(int num:nums){
            if (num == 2){
                sum+=2;
            }
        }
        if (sum==8){
            res = true;
        }
        return res;
    }

}
