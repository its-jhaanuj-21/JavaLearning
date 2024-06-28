import java.util.Arrays;
public class A02SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxInArray(arr, 0, last);
            swap(arr, maxIndex, last);
        }

    }

    static int getMaxInArray(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start ; i<end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}