package Logic1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars >= 40 && cigars<= 60) && !isWeekend){
            return true;
        }else if ((cigars < 40 || cigars < 60)  && !isWeekend){
            return false;
        }else if ((cigars >= 40 || cigars > 60) && isWeekend){
            return true;
        }else {
            return false;
        }
    }
}
