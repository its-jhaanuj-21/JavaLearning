
// Linear Search in ARRAY : FOUND -> return INDEX | NOT FOUND -> return -1
public class A01LinerSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};  // ARRAY
        int target = 7;   // target to search

        int ans = LinerSearch(arr, target);  // function call
        System.out.println(ans);  

    }

    static int LinerSearch(int arr[], int target){
        // if array is empty return -1
        if(arr.length == 0){
            return -1;
        }

        for(int index=0; index<arr.length; index++){
            int element = arr[index];
            if(target == element){
                return index;
            }
        }
        return -1;
    }
}






