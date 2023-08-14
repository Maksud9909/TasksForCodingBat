package LeetCode;

import javax.management.MBeanAttributeInfo;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        find(arr);
    }

    public static void  find(int [] array){
        int result = 0;
        for (int n:array){
            if (n == 1){
                result++;
                System.out.println(result);
            }else {
                result+=0;
            }
        }
    }

}
