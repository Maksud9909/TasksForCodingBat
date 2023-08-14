package LeetCode;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(hammingWeight(000000111));
    }
    public static int hammingWeight(int n) {
        int res = 0;
        String nResult = String.valueOf(n);
        for (int i = 0; i < nResult.length(); i++) {
            char letters = nResult.charAt(i);
            if (letters == 1){
                res++;
            }
        }
        return res;
    }
}

