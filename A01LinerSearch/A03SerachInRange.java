
// Linear Search in ARRAY : Serach in particular range | Return -> true / false

public class A03SerachInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 8;

        System.out.println(LinerSearchInRange(arr, target, 3, 7));
    }

    static boolean LinerSearchInRange(int arr[], int target, int start, int end){
        // if array length is 0 : That is if array is empty
        if(arr.length == 0){
            return false;
        }

        for(int index = start; index<=end; index++){  // iterating from start to end
            int element = arr[index];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}




