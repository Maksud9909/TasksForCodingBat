package Array;

public class Start1 {
    public int start1(int[] a, int[] b) {
        int counter = 0;
        if (a.length < 1 && b.length < 1){
            counter=0;
        } else if (a[0] == 1 && b.length < 1) {
            counter++;
        }else if (b[0] == 1 && a.length < 1){
            counter++;
        } else if (b[0] == 1 && a[0] == 1) {
            counter+=2;
        }else {
            counter++;
        }
        return counter;
    }
}
