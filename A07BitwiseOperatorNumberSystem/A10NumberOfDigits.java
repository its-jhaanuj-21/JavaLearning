public class A10NumberOfDigits {
    public static void main(String[] args) {
        /*
         *   No of digits in base b of the number n
         * 
         *      (int) ( log n ) +1
         *                 b
         * 
         * 
         * 
         */
        int n1 = 10;
        int b1 = 10;
        
        int n2 = 10;
        int b2 = 2;

        int decDigits = (int) (Math.log(n1) / Math.log(b1)) +1;
        int binDigits = (int) (Math.log(n2) / Math.log(b2)) +1;
        System.out.println(decDigits);
        System.out.println(binDigits);
    }
}
