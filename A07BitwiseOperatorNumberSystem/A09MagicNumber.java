/*
 *   Magic Number : 
 *      
 *   1st  ->  0001 ->  (1 * 5^1) = 5
 *   2nd  ->  0010 ->  (0 * 5^1) + (1 * 5^2)  =  25
 *   3rd  ->  0011 ->  (1 * 5^1) + (1 * 5^2)  =  30
 *   4th  ->  0100 ->  (0 * 5^1) + (0 * 5^2) + (1 * 5^3)  =  125
 *   
 *  
 */


public class A09MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(nthMagicNo(n)); 
    }

    private static int nthMagicNo(int n){
        int ans = 0;
        int base = 5;
        while(n>0){
            int last = n & 1;
            n = n >> 1;
            ans += last * base;
            base *=5; 
        }  
        return ans;      
    }
}
