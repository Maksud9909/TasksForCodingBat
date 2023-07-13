package Logic1;

public class TwoAsOne {
    public boolean twoAsOne(int a, int b, int c) {
        if (a - b == c || b - a == c ){
            return true;
        }else if (a+b == c){
            return true;
        }else {
            return false;
        }
    }

}
