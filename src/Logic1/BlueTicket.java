package Logic1;

public class BlueTicket {
    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (a+b == 10 || a+c == 10 || b + c == 10){
            return 10;
        }else if (ab - bc == 10 || ab -ac == 10){
            return 5;
        }else {
            return 0;
        }
    }

}
