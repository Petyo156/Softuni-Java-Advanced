import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;

public class _4_CountStuff {
    public static void main(String[] args) {

        String inputPath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        String outputPath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";

        try(BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
            BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))){
            String line = reader.readLine();

            int countVowels = 0;
            int countZnaci = 0;
            int defaultCount = 0;
            while(line != null){
                for (int i = 0; i < line.length(); i++) {
                    switch (line.charAt(i)){
                        case 'a':
                        case 'e':
                        case 'i':
                        case 'o':
                        case 'u':
                            countVowels++;
                            break;
                        case '!':
                        case ',':
                        case '.':
                        case '?':
                            countZnaci++;
                            break;
                        case ' ':
                            break;

                            default:
                            defaultCount++;
                            break;
                    }
                }
                line = reader.readLine();
            }
            //Vowels: 41 Other symbols: 72 Punctuation: 6
            writer.write("Vowels: "+countVowels+"\nOther symbols: "+defaultCount+"\nPunctuation: "+countZnaci);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
