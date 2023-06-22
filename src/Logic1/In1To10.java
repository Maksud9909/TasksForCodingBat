package Logic1;

public class In1To10 {
    public static void main(String[] args) {

    }
    public boolean in1To10(int n, boolean outsideMode) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        for (int ar:arr) {
            if (ar == n && !outsideMode){
                return true;
            }
        }
        if (n == 9 && outsideMode) {
            return false;
        }
        else if ((n>1 && outsideMode) || (n<9 && outsideMode)){
            return true;
        }  else {
            return false;
        }




    }

}
