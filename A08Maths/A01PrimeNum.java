/**
 * A01PrimeNum
 */
public class A01PrimeNum {
    public static void main(String[] args){
        int n1 = 5;
        int n2 = 6;
        int n3 = 2;
        int n4 = -1;
        int n5 = 17;

        System.out.println(isPrime1(n1));
        System.out.println(isPrime1(n2));
        System.out.println(isPrime1(n3));
        System.out.println(isPrime1(n4));
        System.out.println(isPrime1(n5));

        System.out.println("");

        
        System.out.println(isPrime2(n1));
        System.out.println(isPrime2(n2));
        System.out.println(isPrime2(n3));
        System.out.println(isPrime2(n4));
        System.out.println(isPrime2(n5));


    }

    static boolean isPrime1(int n){
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
        }
        for(int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            return true;
        }else{
            return false;
        }
    }


    static boolean isPrime2(int n){
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true; // 2 is the only even prime number
        }
        if (n % 2 == 0) {
            return false; // Exclude other even numbers
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}