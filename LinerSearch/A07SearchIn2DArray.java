
// Searching in 2D array and returning an array with position of row and col
import java.util.Arrays;
public class A07SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr  = {
                        {1,2,3,67},
                        {56, 88, 98, 90, 111}, 
                        {4,5, 10}, 
                        {19, 55}
                    };

        int target = 111;
        int[] ans= search2D(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2D(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}






