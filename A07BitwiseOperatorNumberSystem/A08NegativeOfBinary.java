public class A08NegativeOfBinary {
    public static void main(String[] args) {
        System.out.println( ~5 + 1 );

        /*     5  => 00000101 => LSB 
                                         
                     |->  0 -> +ve
                          1 -> -ve

                byte ->   -128 to 127           
                      1xxxxxx      0xxxxxxx
                
                --- How to find -ve of binary --
                1. =>  complemet of that number
                2. =>  +1

                (5) base 10 =>  (00000101) base 2
                   
                1. => complement  of   00000101 => 11111010 => -6
                2. Add + 1   => 11111010  
                               +       1
                               -----------
                                11111011 ->    -5
        */   

        System.out.println(10 - (~5) -1);
    }
}
