package Logic2;

public class MakeChocolate {
    public int teaParty(int tea, int candy) {
        if (tea<5 && candy<5){
            return 0;
        }
        if ((tea/candy >= 2 && (tea>=5 && candy>=5)) || (candy/tea >= 2)&& (tea>=5 && candy>=5)){
            return 2;
        }
        else {
            return 1;
        }
    }


}
//else if (tea>= 5 && candy>= 5){
//            return 1;
//        }