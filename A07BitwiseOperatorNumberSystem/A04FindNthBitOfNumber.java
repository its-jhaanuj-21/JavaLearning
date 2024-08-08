public class A04FindNthBitOfNumber {
    public static void main(String[] args) {
        int num = 21; // Binary : 10101
        // int n = 0; 

        // int nthBit = findNthBit(num, n);
        // System.out.println(nthBit);
        System.out.println(findNthBit(num, 0));
        System.out.println(findNthBit(num, 1));
        System.out.println(findNthBit(num, 2));
        System.out.println(findNthBit(num, 3));
        System.out.println(findNthBit(num, 4));
    }

    private static int findNthBit(int num, int n){
        // return (num & (1 << (n))) >> (n);
        return (num >> n) & 1;
    }
}
