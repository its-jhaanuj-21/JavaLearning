import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A0402BufferedReaderQues2 {
    public static void main(String[] args) throws IOException{
        String fileName = "Text.txt";

        BufferedReader fileBuffer = new BufferedReader(new FileReader("Text.txt"));

        int wordCount = 0;
        int charCount = 0;


        StringBuilder fileText = new StringBuilder();

        String line;
        while((line = fileBuffer.readLine()) !=null){
            charCount += line.length();  // count character 

            String[] words = line.split("\\s+");
            wordCount += words.length;

            fileText.append(line).append("\n");
        }

        System.out.println("File Text: ");
        System.out.println(fileText);
        
        System.out.println("No of character: "+charCount);
        System.out.println("No of words: "+wordCount);

        fileBuffer.close();



        
    }
}
