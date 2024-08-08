public class A10PracticeQuestion {
    public static void main(String[] args) {
        Nto1(5);
        System.out.println();

        Nto1BackTracking(5,1);
        System.out.println();

        ONEtoN(5);
        System.out.println();

        Nto1_1toN(5);
        System.out.println();

        System.out.println("Factorial: "+factorial(5));

        System.out.println("Sum of N: "+sumOfN(5));

        System.out.println("Sum of Digits: "+sumOfDigits(1234560));

        System.out.println("Product of Digits:  "+productOfDigits(12345));

        System.out.println("Revesre Number with Helper fun: "+ReverseNumber(1234));
        System.out.println("Revesre Number without Helper function: "+reverseNumber(1234));

        System.out.println("Palindrome: "+Palindrome(1234321));
        System.out.println("Palindrome: "+Palindrome(12343251));

        System.out.println("No of zeros: "+countZeros(1020230));

    }

    // Print N to 1 Linearly
    public static void Nto1(int n){
        if(n==0){   // OR => (n<1)
            return;
        } 
        System.out.print(n+" ");
        // Nto1(n-1); 
        Nto1(--n);  // correct
        // Nto1(n--);  // incorrect
    }

    // Print N to 1 BackTracking
    public static void Nto1BackTracking(int n, int c){
        if(c>n){
            return;
        }
        Nto1BackTracking(n, c+1);
        System.out.print(c+" ");
    }


    // print 1 to N 
    public static void ONEtoN(int n){
        if(n==0){
            return;
        }
        ONEtoN(n-1);
        System.out.print(n+" ");
    }


    // Print N to 1 then 1 to N
    public static void Nto1_1toN(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        Nto1_1toN(n-1);
        System.out.print(n+" ");
    }


    // Factorial;
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    // sum of N numbers
    public static int sumOfN(int n){
        if(n<=1){
            return 1;
        }
        return n+sumOfN(n-1);
    }

    // Sum of digits
    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumOfDigits(n/10);
    }


    // Product of digits : 
    public static int productOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * productOfDigits(n/10);
    }


    // Reverse the number
    public static int ReverseNumber(int n){
        return reverseHelper(n, 0);
    }
    private static int reverseHelper(int n, int rev){
        if(n==0){
            return rev;
        }
        rev = rev*10 +n%10;
        return reverseHelper(n/10, rev);
    }

    // Reverse without helper function : 
    public static int reverseNumber(int n){
        if(n<10){
            return n;
        }
        int numDigits = (int)Math.log10(n);
        int rem = n%10;
        return rem * (int)Math.pow(10,numDigits)+reverseNumber(n/10);
    }

    // Palindrome
    public static boolean Palindrome(int n){
        return (n== reverseNumber(n));
    }


    // count number of zeros in number
    public static int countZeros(int n){
        return helperCount(n, 0);
    }
    private static int helperCount(int n, int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            return helperCount(n/10, c+1);
        }
        return helperCount(n/10, c);
    }




}

















