public class A06ResetNthBit {
    public static void main(String[] args) {
        int num = 21; // Binary: 10101
        int n = 2;
        // Reset 2nd bit to 0;  => 10001 => 17
        System.out.println(resetNthBit(num, n)); // 17
    }

    private static int resetNthBit(int num, int n){
        return num & (~(1<<n));
    }
}
