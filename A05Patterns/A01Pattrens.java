/**
 * A01Pattrens
 */
public class A01Pattrens {
    public static void main(String[] args) {
        pattern1(6);
        System.out.println();
        pattern2(6);
        System.out.println();
        pattern3(6);
    }



    public static void pattern1(int n){
        /*
                * * * * * * 
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
         */
        for(int row = 1; row <= n; row++){
            for(int column = 1; column <= n; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }




    public static void pattern2(int n){
        /*
                * 
                * *
                * * *
                * * * *
                * * * * *
                * * * * * *
         */
        for(int row = 1; row<=n; row++){
            for(int column = 1; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void pattern3(int n){
        /*
               
         */
        for(int row = 1; row<=n; row++){
            for(int column = 1; column<=n-row+1; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}