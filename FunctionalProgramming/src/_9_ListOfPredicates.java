import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _9_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Predicate<Integer> isDivisibleBySequence = num ->
                numbers.stream().anyMatch(e -> num % e == 0);
        for (int i = 1; i <= n; i++) {
            if (isDivisibleBySequence.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
