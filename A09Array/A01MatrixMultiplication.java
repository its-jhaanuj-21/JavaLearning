/**
 * A01MatrixMultiplication
 */
public class A01MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = { { 1, 2, 3 },
                       { 4, 5, 6 } };   // 2 x 3
        int[][] m2 = { { 1, 2 },
                       { 3, 4 },
                       { 5, 6 } };     //  3 x 2

        int row1 = m1.length;
        int col1 = m1[0].length;
        int col2 = m2[0].length;
        int[][] ans = new int[row1][col2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    ans[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        for (int[] i : ans) {
            for(int elem : i){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
    }

}