import java.util.*;

public class _3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalStuff = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();
            String[] splitInput = input.split(" ");

            chemicalStuff.addAll(Arrays.asList(splitInput));

        }
        String result = String.join(" ", chemicalStuff);
        System.out.println(result);
    }
}
