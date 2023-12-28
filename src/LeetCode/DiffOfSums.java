package LeetCode;

import com.sun.security.jgss.GSSUtil;

public class DiffOfSums {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10,3));
    }
    public static int differenceOfSums(int n, int m) { // 10   3
        int sumOfDivided = 0;
        int sumOfNonDivided = 0;
        for (int i = 0; i < n+1; i++) {
            if (i%m==0){
                sumOfDivided+=i;
            }else{
                sumOfNonDivided+=i;
            }
        }
        System.out.println(sumOfDivided);
        System.out.println(sumOfNonDivided);
        return sumOfNonDivided - sumOfDivided;
    }
}
