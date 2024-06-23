public class A04FloorOfNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13,15,17,19};
        int target = 6;
        System.out.println(floor(arr, target));
    }

    // Floor of number is : greatest number <= target
    // {1,3,5,7,9,11,13,15,17,19} -> in this before 6 : 5 is greatest smaller element

    static int floor(int arr[], int target){

         // if the target is smaller then smallest element in array
         if(target<arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}



