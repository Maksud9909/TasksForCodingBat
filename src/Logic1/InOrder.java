package Logic1;

public class InOrder {
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (b > a && b < c && !bOk){
            return true;
        } else if (bOk && c > b) {
            return true;
        }else {
            return false;
        }
    }
}
