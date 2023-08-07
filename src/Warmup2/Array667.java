package Warmup2;

public class Array667 {
    public int array667(int[] nums) {
        int result = 0;
        for (int i = 1; i < nums.length; i++) {
            if (i==6 || i==7){
                result +=1;
            }
        }
        return result;
    }

}
