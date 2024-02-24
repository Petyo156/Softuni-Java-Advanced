import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _6_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Predicate<String> lenghtSmallerThanN = s -> s.length() <= n;


        Arrays.stream(scanner.nextLine().split(" "))
                .filter(lenghtSmallerThanN).forEach(System.out::println);
    }
}
