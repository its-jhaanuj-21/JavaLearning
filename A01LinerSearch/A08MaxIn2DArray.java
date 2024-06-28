// MAX in 2d array ........
public class A08MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr  = {
            {1,2,3,67},
            {56, 88, 98, 90, 111}, 
            {4,5, 10}, 
            {19, 55}
        };
        System.out.println(maxIn2DArray(arr));
    }

    static int maxIn2DArray(int[][] arr){
        int max = Integer.MIN_VALUE;

        // Through Enhanced For loop
        // for (int[] row : arr) {
        //     for (int col : row) {
        //         if(col>max){
        //             max = col;
        //         }
        //     }
        // }

        // Through normal nested for loop
        for(int row=0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}



