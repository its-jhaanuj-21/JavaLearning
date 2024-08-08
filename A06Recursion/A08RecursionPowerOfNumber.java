public class A08RecursionPowerOfNumber {
    public static void main(String[] args) {
        int num = 2;
        int pow = 3;
        int ans = power(num, pow);
        System.out.println(ans);
    }

    static int power(int num, int pow){
        if(pow==0){
            return 1;
        }
        return num * power(num, pow-1);
    }
}
