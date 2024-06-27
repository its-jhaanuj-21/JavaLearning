// when given no's from range 1, to N => use cyclic sort 

import java.util.Arrays;

public class A04CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 4, 2 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        int i = 0 ;
        while (i<arr.length) {
            int correctIndex = arr[i] -1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
