public class A07RecursionSumOfDigit {
    public static void main(String[] args) {
        int num = 1234;
        int ans = digitSum(num);
        System.out.println(ans);
    }

    public static int digitSum(int n){
        if(n==0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
}
