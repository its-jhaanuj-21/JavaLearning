
// Finding minimum in Array 

public class A04MinInArray {
    public static void main(String[] args) {
        int arr[] = {19, 33, 2, 44, 55, 9, 5, -6};
        System.out.println(minInArray(arr));


        int[] arr2 = {12, 56, 9, -5, 74, 100};
        System.out.println(minInArray2(arr2));
    }

    // Approach 1 : Assuming 1st index as min then comparing with all 
    static int minInArray(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    // Approach 2: Taking min as Integer.MAX_VALUE then storing minimun values by comparing with others
    static int minInArray2(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}









