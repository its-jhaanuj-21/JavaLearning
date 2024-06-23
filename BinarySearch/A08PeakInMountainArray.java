public class A08PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,1};
        System.out.println(Peak(arr));
    }

    static int Peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid+1]){
                // In decreasing part of array 
                // this may be the answer, but look at left
                // this is why end != mid - 1
                end = mid;
            } else{
                // you are in ascending part of arry 
                start = mid+1; // because we know that mid+1 element > mid element
            }
        }
        return start;
    }
}
