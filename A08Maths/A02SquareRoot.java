public class A02SquareRoot {
    public static void main(String[] args) {
        
    }

    static int sqrt1(int n){
        int start = 0;
        int end = n;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if(mid*mid == n){
                return mid;
            }
        }
    }
}
