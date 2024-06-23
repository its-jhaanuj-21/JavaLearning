public class A03CeilingOfNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13,15,17,19};
        int target = 20;
        System.out.println(ceilling(arr, target));
    }

    // Ceilling of number is : smaller number >= target.
    // {1,3,5,7,9,11,13,15,17,19} -> in this after 6 : 7 is least greatest element

    static int ceilling(int arr[], int target){

        // if the target is greater then greatest element in array
        if(target>arr[arr.length-1]){
            return -1;
        }

        int start = 0; 
        int end = arr.length-1;

        while(start<=end){
            int mid = start + ((end-start)/2);
            if(target>arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }

}
