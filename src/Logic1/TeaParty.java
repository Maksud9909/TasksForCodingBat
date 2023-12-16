package Logic1;



public class TeaParty {
    public int teaParty(int tea, int candy) {
        int res = 0;
        if (tea/candy >= 2 && tea < 4 || candy/tea >= 2 && candy < 4) {
            res = 2;
        }
        else if (tea > 4 && candy > 4){
            res = 1;
        }
        else {
            res = 0;
        }
        return res;
    }

}
