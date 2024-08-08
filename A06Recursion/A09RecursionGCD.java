public class A09RecursionGCD {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 6;

        int ans = gcd(n1, n2);
        System.out.println(ans);
    }

    static int gcd(int n1,int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2, n1%n2);
    }
}
