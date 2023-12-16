package Logic1;

public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        String res = null;
        if (!vacation){
            if (day < 6 && day > 0){
                return res = "7:00";
            }else {
                return res = "10:00";
            }
        } else if (vacation) {
            if (day < 6 && day > 0){
                return res = "10:00";
            }else {
                return res = "off";
            }
        }
        return res;
    }

}
