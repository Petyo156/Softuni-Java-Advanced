import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _2_SumBytes {
    public static void main(String[] args) {
        String path = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            int sum = 0;
            String line = bufferedReader.readLine();
            while(line != null){

                for (int i = 0; i < line.length(); i++) {
                    sum+=line.charAt(i);
                }

                line = bufferedReader.readLine();
            }
            System.out.println(sum);

        } catch (IOException ignored){

        }
    }
}
