/**
 * Recursion
 */
public class A01Recursion {
    public static void main(String[] args) {
        // write the function that print hello world
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
        message5();
    }
    static void message5(){
        System.out.println("Hello World");
    }
    
}