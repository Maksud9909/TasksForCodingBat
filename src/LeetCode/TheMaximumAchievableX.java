package LeetCode;

public class TheMaximumAchievableX {
    public int theMaximumAchievableX(int num, int t) {
        return ((num * t) + 1) + ((t * t) + 1);
    }
}
