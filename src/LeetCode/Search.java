package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Search {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) { // 1 2 3 4 5 target = 3
        int index = 0;
        for (int num:nums) {
            if (num == target){
               index =  Arrays.binarySearch(nums,target);
               break;
            }else {
                index = -1;
            }
        }

        return index;
    }
}

