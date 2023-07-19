package Logic1;

public class ShareDigits {
    public boolean shareDigit(int a, int b) {
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        if (aStr.contains(bStr)){
            return true;
        }else {
            return false;
        }
    }

}
