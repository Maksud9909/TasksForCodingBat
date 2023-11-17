package Array2;

public class CountEvens {
    public int countEvens(int[] nums) {
        int result = 0;
        for (int num:nums) {
            if (num % 2 == 0){
                result++;
            }else {
                result+=0;
            }
        }
        return result;
    }

}
