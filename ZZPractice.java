import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZZPractice {
    public static void main(String... args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String name = br.readLine();

        System.out.println("Enter DOB (DD/MM/YYYY)");
        String strDob = br.readLine();
        
        String dobArr[] = strDob.split("/");
        
        int date = Integer.parseInt(dobArr[0]);         
        int month = Integer.parseInt(dobArr[1]);         
        int year = Integer.parseInt(dobArr[2]);    
        
        System.out.println("Name: "+name);
        System.out.println("DOB "+date+"/"+month+"/"+year);
        

    }

}
