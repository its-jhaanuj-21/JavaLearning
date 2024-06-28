
// Printing Second Largest in array 

public class A06SecondLargestInArray {
    public static void main(String[] args) {
        int[]  arr =  {12,3,94,5,6,33,-98, 77};
        System.out.println(secondLargestInArray(arr));
    }

    static int secondLargestInArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j]>secondlargest && arr[j] != largest){
                secondlargest = arr[j];
            }
        }
        return secondlargest;
    }
}


