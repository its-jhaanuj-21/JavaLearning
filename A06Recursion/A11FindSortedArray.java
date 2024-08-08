public class A11FindSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println("Is Sorted Normally: "+ isSorted(arr));
        System.out.println("Is Sorted Recursivly: "+ isSortedRecursion(arr, 0));
    }


    static boolean isSorted(int[] arr){
        for(int i=0 ; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    
    static boolean isSortedRecursion(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSortedRecursion(arr, index+1);
    }
}
