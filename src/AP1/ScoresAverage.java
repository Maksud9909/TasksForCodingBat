package AP1;

public class ScoresAverage {
    public int scoresAverage(int[] scores) {
        int length = scores.length / 2;
        int average =
    }

    int average(int[] scores, int start, int end){
        int res = 0;
        for (int i = start; i < scores[end]; i++) {
            res+=scores[i];
        }
        return res;
    }

}
