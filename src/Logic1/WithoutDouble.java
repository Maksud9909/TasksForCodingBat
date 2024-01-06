package Logic1;

public class WithoutDouble {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (die2==die1 && noDoubles){
            if (die2 == 6 || die1 == 6){
                return 6+1;
            }
            return die1 + die2 + 1;
        }

        return die1+die2;
    }

}
