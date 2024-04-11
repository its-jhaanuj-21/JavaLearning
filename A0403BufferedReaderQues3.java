import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0403BufferedReaderQues3 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Your Name: ");
        String name = br.readLine();

        System.out.println("Enter Your DOB (DD/MM/YYYY): ");
        String strDOB = br.readLine();

        String []arrDOB = strDOB.split("/");

        int Date = Integer.parseInt(arrDOB[0]);
        int Month = Integer.parseInt(arrDOB[1]);
        int Year = Integer.parseInt(arrDOB[2]);

        System.out.println("Enter Your Grade: ");
        char grade = br.readLine().charAt(0);

        System.out.println("Name: "+name);
        System.out.println("DOB: "+Date+"/"+Month+"/"+Year);
        System.out.println("Grade: "+grade);


    }    
}
