import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _6_Emails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> info = new LinkedHashMap<>();

        while(true){
            String name = scanner.nextLine();
            if(name.equals("stop")){
                break;
            }
            String email = scanner.nextLine();
            String[] emailParts = email.split("\\.");
            if(!emailParts[emailParts.length-1].equals("us")&&
                    !emailParts[emailParts.length-1].equals("uk")&&
                    !emailParts[emailParts.length-1].equals("com")){
                info.putIfAbsent(name,email);
            }
        }

        for (var entry:info.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
