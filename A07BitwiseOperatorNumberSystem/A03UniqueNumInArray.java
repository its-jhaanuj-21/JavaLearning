public class A03UniqueNumInArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, -2, 5, -3, -4};
        System.out.println(uniqueInArray1(arr1));

        int[] arr2 = {2, 2, 2, 2, 3, 3, 3, 3, 1, 1, 1, 1, 4};
        System.out.println(uniqueInArray2(arr2));
        
        int[] arr3 = {2, 2, 2, 2,2,3, 3, 3,3,3, 4};
        System.out.println(uniqueInArray3(arr3));


    }

    private static int uniqueInArray1(int[] arr){
        int sum = 0;
        for(int i: arr){
            sum+=i;
        }
        return sum;
    
    }

    private static int uniqueInArray2(int[] arr){
        int unique = 0;
        for(int i: arr){
            unique ^=i ;
        }
        return unique;
    }

    public static int uniqueInArray3(int[] arr) {
        int result = 0;

        // There are 32 bits in an integer
        for (int i = 0; i < 32; i++) {
            int sum = 0;

            // Count the number of 1s in the i-th bit position
            for (int num : arr) {
                if ((num & (1 << i)) != 0) {
                    sum++;
                }
            }
            // If the count of 1s in this bit position is not a multiple of 3, 
            // it means this bit position contributes to the unique number
            if (sum % 5 != 0) {
                result |= (1 << i);
            }
        }
        return result;
    }


}
