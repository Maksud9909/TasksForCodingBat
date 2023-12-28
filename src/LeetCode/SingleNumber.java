package LeetCode;



public class SingleNumber {
    public static void main(String[] args) {
        int nums [] = {4,1,2,1,2};
        System.out.println(findSingleNumber(nums));

    }


    public static int findSingleNumber(int[] nums) {
        int result = 0;

        // XOR all elements in the array
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }

}

