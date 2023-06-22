package Logic1;

public class NearTen {
    public boolean nearTen(int num) {
        if (num%10 == 1 || num%10 == 2){
            return true;
        }else if (num%10 == 9 || num%10 == 8){
            return true;
        }else if (num%10 == 0){
            return true;
        }else {
            return false;
        }
    }

}
