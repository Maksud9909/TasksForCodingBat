package AP1;

public class ScoresIncreasing {
    public static void main(String[] args) {
        ScoresIncreasing scoresIncreasing = new ScoresIncreasing();
        int [] arr = {1,23,45};
        scoresIncreasing.scoresIncreasing(arr);
    }
    public boolean scoresIncreasing(int[] scores) {
        boolean result = false;
        if (scores.length>=2){
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] > scores[i+1]){
                    result = true;
                }else {
                    result = false;
                }
            }
        }
        return result;
    }

}
