package Logic1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int res = 0;
        if(isBirthday){
            if (speed < 66){
                res = 0;
            } else if (speed > 66 && speed < 86) {
                res = 1;
            }else {
                res = 2;
            }
        } else if (!isBirthday) {
            if (speed < 61){
                res = 0;
            } else if (speed > 61 && speed < 81) {
                res = 1;
            }else {
                res = 2;
            }
        }
        return res;
    }

}
