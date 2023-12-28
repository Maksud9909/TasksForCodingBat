package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidWithCandies {
    public static void main(String[] args) {
        int arr [] = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleans = new ArrayList<>();
        int maxRes = Arrays.stream(candies).max().getAsInt();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= candies[i+1]){
                booleans.add(true);
            }
            else {
                booleans.add(false);
            }
        }
        return booleans;
    }
}
