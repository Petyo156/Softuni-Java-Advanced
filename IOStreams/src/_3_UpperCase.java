import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class _3_UpperCase {
    public static void main(String[] args) {
        String inputPath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        String outputPath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {
            String line = reader.readLine();
            while(line != null){
                writer.write(line.toUpperCase());
                writer.write(System.lineSeparator());
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
