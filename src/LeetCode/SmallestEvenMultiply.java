package LeetCode;


import java.util.Scanner;

public class SmallestEvenMultiply {
    public static void main(String[] args) {
        System.out.println(smallestEvenMultiple(5));
    }

    public static int smallestEvenMultiple(int n) {
        if (n%2!=0){
            n*=2;
        }else {
            return n;
        }
        return n;
    }
}
