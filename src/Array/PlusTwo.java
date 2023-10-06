package Array;

public class PlusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        int [] arr = new int[4];
        for (int i = 0; i < a.length; i++) {
            arr[i]+=a[i];
        }
        for (int i = 2; i < b.length; i++) {
            arr[i]+=b[i];
        }
        return arr;
    }

}
