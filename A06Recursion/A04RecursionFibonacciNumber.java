/**
 *                                     fib(4)
 *                        fibo(3)        +          fib(2)
 *                   fib(2)  +  fibo(1)        fib(1)  + fibo(0)
 *               fib(1) + fibo(0)      
 * 
 * 
 */
public class A04RecursionFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo(int n ){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2); // 
    }
}
