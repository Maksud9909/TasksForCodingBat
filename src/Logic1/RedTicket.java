package Logic1;

public class RedTicket {
    public int redTicket(int a, int b, int c) {

        if (a == 2 && b ==2 && c == 2){
            return 10;
        }else if (b!=a && c!=a){
            return 1;
        } else if (a == b && b == c){
            return 5;
        }else {
            return 0;
        }
    }

}
