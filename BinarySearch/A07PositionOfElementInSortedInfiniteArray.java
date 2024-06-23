public class A07PositionOfElementInSortedInfiniteArray {
    public static void main(String[] args) {
        int[] numbers = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
        };

        int target = 20;
        System.out.println(ans(numbers, target));
    }

    static int ans(int[] arr, int target){
        // First find the range | start with a box size 2
        int start = 0; 
        int end = 1;
        // condition for target to lie in the range
        while(target > arr[end]){
            int temp = end+1; // new start
            // Now x2 the box size | end = prev end + sizeOfBox*2
            end = end+(end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
