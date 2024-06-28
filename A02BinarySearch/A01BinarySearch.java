public class A01BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 7, 9, 10 };
        int target = 4;
        System.out.println(binarySearch(arr, target));
    }

    static boolean binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // int mid = (start + end) / 2;  // exceed the int range if start and end is larger value.
            int mid = start + ((end-start)/2); 
            if (target > arr[mid]) {
                start = mid+1;
            } else if (target<arr[mid]) {
                end = mid-1;
            }else{
                return true;
            }
        }
        return false;
    }
}



