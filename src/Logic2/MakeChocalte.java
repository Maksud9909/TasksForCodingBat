package Logic2;

public class MakeChocalte {
    public int makeChocolate(int small, int big, int goal) {
        int diff = goal - (big * 5);
        if ((big * 5) + small == goal){
            return small;
        } else if (diff < small) {
            return diff;
        }
        return -1;
    }
}
