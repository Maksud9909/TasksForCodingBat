package Z;



public class Test {
    public boolean lucky13(int[] nums) {
        boolean res = true;
        for (int num : nums) {
            if (num == 1 || num == 3) {
                res = false;
                break;
            }
        }
        return res;
    }

}
