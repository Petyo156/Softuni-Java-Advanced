import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _5_LineNumbers {
    public static void main(String[] args) {
        String inputPath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt";
        String outputPath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";

        try(BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
            BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {
            String line = reader.readLine();
            int count = 1;
            while (line != null){
                writer.write(count+". "+line+"\n");
                count++;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
