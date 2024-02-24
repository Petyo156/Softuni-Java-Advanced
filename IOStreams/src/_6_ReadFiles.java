import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _6_ReadFiles {
    public static void main(String[] args) {
        String onePath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\words.txt";
        String twoPath = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt";

        try(BufferedReader oneReader = Files.newBufferedReader(Path.of(onePath));
            BufferedReader twoReader = Files.newBufferedReader(Path.of(twoPath))){

            Map<String, Integer> map = new LinkedHashMap<>();

            String lineOne = oneReader.readLine();
            while(lineOne != null){
                String[] arr = lineOne.split(" ");
                for (String s : arr) {
                    map.put(s, 0);
                }
                lineOne = oneReader.readLine();
            }

            String lineTwo = twoReader.readLine();
            while(lineTwo != null){
                String[] arr = lineTwo.split(" ");
                for (String s : arr) {
                    if(map.containsKey(s)){
                        map.put(s, map.get(s)+1);
                    }
                }
                lineTwo = twoReader.readLine();
            }
            map.forEach((key, value) -> {
                System.out.println(key + " - " + value);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
