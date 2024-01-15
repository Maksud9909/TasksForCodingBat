package Logic2;

public class CloseFar {
    public static boolean closeFar(int a, int b, int c) {
        boolean bCloseToA = Math.abs(a - b) <= 1;
        boolean cCloseToA = Math.abs(a - c) <= 1;
        boolean bFarFromC = Math.abs(b - c) >= 2;
        boolean cFarFromB = Math.abs(c - b) >= 2;

        return (bCloseToA && cFarFromB) || (cCloseToA && bFarFromC);
    }

}
