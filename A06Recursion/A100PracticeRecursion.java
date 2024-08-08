import java.util.Arrays;

public class A100PracticeRecursion {
    public static void main(String[] args) {
        int n = 5;
        // printName(1, "Anuj");
        // printLinearlyToN(1, n);
        // printNtoOne(n);

        // printLinearlyToNBacktracking(n);
        // printNtoOneBacktracking(1, n);

        // sumOfFirstNParametrized(5, 0);
        // System.out.println(sumOfFirstNFunctional(5));

        // System.out.println(factorial(5));

        // int[] arr = {1,2,3,4,5};
        // int ans[] = reverseArray(arr);
        // System.out.println(Arrays.toString(ans));
        
        
        // int[] arr = {1,2,3,4,5};
        // int ans[] = reverseArrayRecusrion(arr, 0, arr.length-1);
        // System.out.println(Arrays.toString(ans));


        






        

    }


    private static void printName(int count, String name){
        if(count == 6){  // The recursion should stop when count reaches 6
            return;
        }
        System.out.println(name);
        printName(++count, name);  // Pre-increment count
    } 


    private static void printLinearlyToN(int c, int n){
        if(c > n){
            return;
        }
        System.out.println(c);
        printLinearlyToN(c+1, n);
    }


    private static void printNtoOne(int c){
        if(c<1){
            return;
        }
        System.out.println(c);
        printNtoOne(c-1);
    }


    private static void printLinearlyToNBacktracking(int n){
        if(n<1){
            return;
        }
        printLinearlyToNBacktracking(n-1);
        System.out.println(n);
    }


    private static void printNtoOneBacktracking(int c, int n){
        if(c>n){
            return;
        }
        printNtoOneBacktracking(c+1, n);
        System.out.println(c);
    }

    // ----------Parametrized Recursion----------
    
    private static void sumOfFirstNParametrized(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sumOfFirstNParametrized(n-1, sum+n);
    }
    
    
    // ----------Functional Recursion----------

    private static int sumOfFirstNFunctional(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfFirstNFunctional(n-1);
    }

    //--------------Factorial-------------

    private static int factorial(int n){
        if(n == 1){
            return n;
        }
        return n * factorial(n-1);
    }


    private static int[] reverseArray(int[] arr){
        int start = 0, end = arr.length-1;
        while (start<=end) {
            // Swapping
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            ++start;
            --end;
        }
        return arr;
    }

    

    







}
