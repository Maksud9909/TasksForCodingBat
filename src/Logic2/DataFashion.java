package Logic2;

public class DataFashion {
    public int dateFashion(int you,int date){
        if (you>=8 && date>2 || date>=8 && you>2){
            return 2;
        }else if (date<=2 || you<=2){
            return 0;
        }else {
            return 1;
        }
    }
}
