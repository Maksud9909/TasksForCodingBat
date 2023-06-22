package Logic1;

public class AnswerCall {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && isMom && !isAsleep){
            return true;
        }else if (isMorning && !isMom && !isAsleep){
            return false;
        }else if (isAsleep){
            return false;
        } else if (!isAsleep && !isMom && !isMorning) {
            return true;
        } else if (!isMorning && !isAsleep && isMom) {
            return true;
        } else {
            return false;
        }
    }

}
