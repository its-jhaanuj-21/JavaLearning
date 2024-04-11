import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0401BufferedReaderQues1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a line of text: ");
        String line = br.readLine();

        StringBuilder reverseLine = new StringBuilder();
        for(int i=line.length()-1; i>=0; i--){
            reverseLine.append(line.charAt(i));
        }

        System.out.println("Reversed String :"+reverseLine);

        br.close();

    }    
}
