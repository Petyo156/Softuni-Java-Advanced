import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _5_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int num = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isNotDivisible = number -> number % num != 0;

        Collections.reverse(numbers);

        numbers.stream().filter(isNotDivisible)
                .forEach(n-> System.out.print(n+" "));

    }
}
