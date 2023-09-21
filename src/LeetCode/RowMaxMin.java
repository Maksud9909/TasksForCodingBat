package LeetCode;

public class RowMaxMin {
    public static void main(String[] args) {
        int [] [] array = {{0,1},{1,0}};
        RowMaxMin maxMin = new RowMaxMin();
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnesCount = -1;
        int rowIndex = -1;


        for (int i = 0; i < mat.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1){
                    onesCount++;
                }
            }
            if (onesCount > maxOnesCount || (onesCount == maxOnesCount && i ==rowIndex)) {
                maxOnesCount = onesCount;
                rowIndex = i;
            }


        }


        return new int[]{rowIndex,maxOnesCount};
    }
}
