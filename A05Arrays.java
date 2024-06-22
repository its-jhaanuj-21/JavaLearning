import java.util.Scanner;
public class A05Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        arr[4] = 1;
        for(int i : arr){
            System.out.print(i+" ");
        }
        
        
        int arr2[] = new int[5];

        // for(int i : arr2){
        //     arr2[i] = sc.nextInt();   // Can't take input through forEnhanced loop
        // }
        
        for(int i =  0; i<arr2.length; i++){
           arr2[i] = sc.nextInt(); 
        }
        System.out.println();
        for(int i : arr2){
            System.out.print(i+" ");
        }
        




    }
}
