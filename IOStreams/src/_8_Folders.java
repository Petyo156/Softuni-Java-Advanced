import java.io.File;

public class _8_Folders {
    public static void main(String[] args) {
        String path = "C:\\Codes\\Softuni\\JAVA Advanced\\IOStreams\\src\\Resourses\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File directory = new File(path);

        if(directory.isDirectory()) {
            File[] files = directory.listFiles();
            int sum = 0;
            for (File file : files) {
                sum += file.length();
            }
            System.out.println("Folder size: "+sum);
        }
    }
}
