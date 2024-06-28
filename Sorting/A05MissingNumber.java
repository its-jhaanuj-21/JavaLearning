/**
 *   If range -> [0, N]
 *      every element will be at index = value
 * 
 *   If range -> [1, N]
 *      every element will be at index = value - 1
 * 
 */


 // missing in array in range of 0 to n
public class A05MissingNumber {

    public static void main(String[] args) {
        int[] arr=  {0,2,3,1};
        int ans = missingNumber2(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int[] arr) {
        int i = 0; 
        while(i<arr.length){
         int correctIndex = arr[i];
         if(arr[i]<arr.length && arr[i]!=arr[correctIndex] ){
             int temp = arr[i];
             arr[i] = arr[correctIndex];
             arr[correctIndex] = temp;
         }else{
             i++;
         }
        }
 
        for(int index = 0; index<arr.length; index++){
         if(arr[index]!=index){
             return index;
         }
        }
 
        return arr.length;
     }


     public static int missingNumber2(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0; i<arr.length; i++){
            sum2 += arr[i];
        }
        return sum-sum2;

    }
}
