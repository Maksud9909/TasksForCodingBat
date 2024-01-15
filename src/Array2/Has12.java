package Array2;

public class Has12 {
    public boolean has12(int[] nums) {
        boolean has1 = false;
       for(int num:nums){ // 3 1 4 6 2
           if (num == 1){
               has1 = true;
           } else if (has1 && num == 2) {
               return true;
           }
       }
       return false;
    }

}
