public class A01Bitwisebasic {
    public static void main(String[] args) {
        
        // Biwise AND [ & ]
        System.out.println("------Bitwise AND------");
        System.out.println("1 & 1 : "+(1 & 1)); // 1
        System.out.println("1 & 0 : "+(1 & 0)); // 0
        System.out.println("0 & 1 : "+(0 & 1)); // 0
        System.out.println("0 & 0 : "+(0 & 0)); // 0
        // a & 1 => a
        // a & 0 => 0
        
        // Biwise OR [ | ]
        System.out.println("------Bitwise OR------");
        System.out.println("1 | 1 : "+(1 | 1)); // 1
        System.out.println("1 | 0 : "+(1 | 0)); // 1
        System.out.println("0 | 1 : "+(0 | 1)); // 1
        System.out.println("0 | 0 : "+(0 | 0)); // 0
        
        // Biwise XOR [ ^ ]
        System.out.println("------Bitwise XOR------");
        System.out.println("1 ^ 1 : "+(1 ^ 1)); // 0
        System.out.println("1 ^ 0 : "+(1 ^ 0)); // 1
        System.out.println("0 ^ 1 : "+(0 ^ 1)); // 1
        System.out.println("0 ^ 0 : "+(0 ^ 0)); // 0
        
        // a ^ 1  => ~a (complemet of a / Opposite of a)
        // a ^ 0  =>  a (Same / No Change)
        // a ^ a  =>  0
        
        
        // Left Bitwise Shift
        System.out.println("------Left Bitwise Shift------");
        System.out.println("2 << 3 : "+(2<<3));
        
        // a << b  =>  a x 2^(b)
        // 2 << 3  =>  2 x 2^(3) => 2 x 8 => 16
        
        
        // Right Bitwise Shift
        System.out.println("------Right Bitwise Shift------");
        System.out.println("32 >> 3 : "+(32>>3));
        
        // a >> b  =>  a / 2^(b)
        // 32 >> 3  =>  32 / 2^(3) => 32 / 8 => 4

        


    }
    
}