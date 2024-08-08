public class A06RecursionFactorial {
    public static void main(String[] args) {
        int ans = factorial(12);
        System.out.println(ans);
    }

    public static int factorial(int n){
        if(n==1){
            return n;
        }
        return n * factorial(n-1);
    }
}
