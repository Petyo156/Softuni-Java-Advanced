import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class _1_SumLines {
    public static void main(String[] args) {
        String path = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while(line != null){

                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum+=line.charAt(i);
                }
                System.out.println(sum);

                line = bufferedReader.readLine();
            }


        } catch (IOException e){

        }
    }
}
