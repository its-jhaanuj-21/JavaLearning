import java.util.ArrayList;

public class A12RecursionLinearSearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,9,8,6,7};
        int target = 5;
        
        int ans = linearSearch(arr, target);
        if(ans!=-1){
            System.out.printf("%d is at index %d\n", target, ans);
        }else{
            System.out.println("Not Found");
        }
        

        target = 9;
        int ans2 = linearSearchRecursion(arr, 0, target);
        if(ans2!=-1){
            System.out.printf("%d is at index %d\n", target, ans2);
        }else{
            System.out.println("Not Found");
        }


        target = 2;
        boolean ans3 = linearSearchRecursion2(arr, 0, target);
        if(ans3) System.out.println("Found");
        else System.out.println("Not Found");


        target = 6;
        findAllIndex(arr, 0, target);
        System.out.println(al);


        target = 6;
        System.out.println(findAllIndex2(arr, 0, target, new ArrayList<>()));
        
        
        target = 6;
        System.out.println(findAllIndex3(arr, 0, target));


        

    }

    static int linearSearch(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }



    static int linearSearchRecursion(int arr[], int index, int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return linearSearchRecursion(arr, index+1, target);
        }
    }



    static boolean linearSearchRecursion2(int arr[], int index, int target){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || linearSearchRecursion2(arr, index+1, target);
    }



    static ArrayList <Integer> al = new ArrayList<>();
    static void findAllIndex(int[] arr, int index, int target){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            al.add(index);
        }
        findAllIndex(arr, index+1, target);
    }



    public static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findAllIndex2(arr, index+1, target, list);
    }


    public static ArrayList<Integer> findAllIndex3(int[] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBellowCalls = findAllIndex3(arr, index+1, target);

        list.addAll(ansFromBellowCalls);

        return list;
    }
    

}


