public class A02EvenOrOddBitwise {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isOdd(n));
    }

    private static boolean isOdd(int n){
        return (n & 1)==1;
    }
}
