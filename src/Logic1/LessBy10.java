package Logic1;

public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        if (((a-b == 1)) || ((b-a) == 1) || ((b-c) == 1) || ((a-c) == 1) || ((c-a) == 1) || ((c-b) ==1) ){
            return true;
        }else {
            return false;
        }
    }

}
