public class A09SqrRoot {
    public static void main(String[] args) {
        int num = 308025;
        System.out.println(sqrt(num));
    }

    private static int sqrt(int num){

        int start = 1;
        int end = num;

        while(start<=end){
            int mid = start + (end - start)/2;
            long square = (long)mid*mid;

            if(num == square){
                return mid;
            }else if(square > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;

    }
}