import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _7_MergeTwoFiles {
    public static void main(String[] args) {
        String inputOne = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt";
        String inputTwo =  "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt";

        String output = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt";

        try(BufferedReader oneReader = Files.newBufferedReader(Path.of(inputOne));
            BufferedReader twoReader = Files.newBufferedReader(Path.of(inputTwo));
            BufferedWriter writer = Files.newBufferedWriter(Path.of(output))){

            String line = oneReader.readLine();
            while (line != null){
                writer.write(line);
                writer.newLine();
                line = oneReader.readLine();
            }
            line = twoReader.readLine();
            while (line != null){
                writer.write(line);
                writer.newLine();
                line = twoReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
