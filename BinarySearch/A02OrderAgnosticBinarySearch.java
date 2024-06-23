// Binary Search in both case if Array is in Asscending or Descending Order
public class A02OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = { -11, -10, 8, 4, 12, 23, 33, 45, 54, 66 };
        int[] arr2 = { 66, 64, 54, 51, 47, 43, 23, 10, -5, -19, -50 };
        int target = 23;
        System.out.println(orderAgnosticBS(arr2, target));  // Pass Either of the Array | arr2 / arr1
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAcc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if(target == arr[mid]){
                return mid;
            }
            if(isAcc){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}








