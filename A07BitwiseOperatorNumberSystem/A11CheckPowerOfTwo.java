public class A11CheckPowerOfTwo {
    public static void main(String[] args) {
        int n = 32;  // fix n=0
        boolean ans = (n & (n-1)) == 0;

        System.out.println(ans);
    }
}
