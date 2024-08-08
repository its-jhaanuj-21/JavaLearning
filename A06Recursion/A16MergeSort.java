import java.util.Arrays;

public class A16MergeSort {
    public static void main(String[] args) {
        int []arr = {3, 4, 6, 1, 2, 9};
        int ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
        
    }

    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        
        int i=0;  // first array
        int j=0; // second array
        int k=0; // mix array

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // add remaining elements;
        while (i<first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;


    }
}
