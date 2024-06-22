// No. of Even Digits numbers in a given array.
public class A09NoOfEvenDigitsNoInArray {
    public static void main(String[] args) {
        int[] arr = {12, 445, 7866, 980982, 11, 2, 233, 109, 8888};
        int evenNumCount = findNumberCount(arr);
        System.out.println(evenNumCount);
    }

    // Finding counts of number in array having even digits
    static int findNumberCount(int arr[]){
        int count = 0;
        for(int num: arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // Checking weather number having even digit or not 
    static boolean even(int num){

        // int digit = 0;
        // while (num>0) {
        //     digit++;
        //     num/=10;
        // }

        int digit = (int)Math.log10(num)+1;  //optimized way: check no digit

        if(digit%2==0){
            return true;
        }
        return false;
    }
}




