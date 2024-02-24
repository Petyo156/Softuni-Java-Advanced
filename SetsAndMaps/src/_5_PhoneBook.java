import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _5_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> people = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while(!input.equals("search")){
            String name = input.split("-")[0];
            String phoneNum = input.split("-")[1];

            people.putIfAbsent(name,phoneNum);
            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while(!input.equals("stop")){
            String name = input;
            if(people.containsKey(name)){
                System.out.printf("%s -> %s%n",name,people.get(name));
            } else {
                System.out.printf("Contact %s does not exist.%n",name);
            }

            input = scanner.nextLine();
        }
    }
}
