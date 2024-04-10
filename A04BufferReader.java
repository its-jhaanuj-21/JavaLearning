import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A04BufferReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Your Name: ");
        String name = br.readLine();
        System.out.println("Enter Your Age: ");
        String ageStr = br.readLine();
        int age = Integer.parseInt(ageStr);
        System.out.println("Hello "+name+" you are "+age+" years old.");
    }
}
