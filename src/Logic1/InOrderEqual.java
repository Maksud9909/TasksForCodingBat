package Logic1;

public class InOrderEqual {
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a<b && b<c && !equalOk){
            return true;
        } if (equalOk && a<=b && b<=c) {
            return true;
        }else {
            return false;
        }
    }

}
