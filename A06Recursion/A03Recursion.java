public class A03Recursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){
        // Base Condition
        /**
         * Condition where our recursion will stop making new calls
         */
        if(n==5){       
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        print(n+1);    // tail recursion
    }

    /**
     * Note : If no base condition : 
     *  Function will keep happening , stack will be filled again and agian. 
     * Memory of computer will exceed the limit -> stack overflow
     */

    /*
     * Why Recusrion ?
     * --> It helps us in solving bigger/complex problems in a simple way 
     * --> We xan convert recursion solution into iterartion & vice versa
     * --> Space complexity is not constant because of recursive call
     * --> It helps us in breaking down bigger problem into simple problems.
     *
     */
}
