public class A05SetNthBit {
    public static void main(String[] args) {
        int num = 21; // Binary: 10101
        int n = 3;
        // set 3rd bit to 1;  => 11101 => 29
        System.out.println(setNthBit(num, n)); // 29
    }

    private static int setNthBit(int num, int n){
        return num | (1<<n);
    }
}
