// Given a binary array nums, return the maximum number of consecutive 1's in the array.
// leetcode : 485. Max Consecutive Ones

public class A11MaxConsecutiveOnesInArray {
    public static void main(String[] args) {
        int [] arr = {1,1,0, 1,1,1,1,1,0, 1,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    static int findMaxConsecutiveOnes(int[] arr){
        int count = 0; int max = 0;
        for (int i : arr) {
            if(i == 1){
                count++;
            }else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
}



