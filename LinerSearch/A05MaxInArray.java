
// Finding Maximum in array 

public class A05MaxInArray {
    public static void main(String[] args) {
        int[]  arr =  {12,3,94,5,6,33,-98, 77};

        System.out.println(maxInArray(arr));

        System.out.println(maxInArray2(arr));
    }

    // Approach 1 
    static int maxInArray(int arr[]){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    // Approach 2
    static int maxInArray2(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}



