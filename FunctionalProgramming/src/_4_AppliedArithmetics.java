import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _4_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<List<Integer>> printList = list -> list.forEach(e -> System.out.print(e+" "));

        Function<List<Integer>, List<Integer>> listAdd =
                list -> list.stream()
                .map(e->e+=1)
                .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> listSubtract =
                list -> list.stream()
                        .map(e->e-=1)
                        .collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> listMultiply =
                list -> list.stream()
                        .map(e->e*=2)
                        .collect(Collectors.toList());

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while(!command.equals("end")) {
            switch (command){
                case "add":
                    input = listAdd.apply(input);
                    break;
                case "multiply":
                    input = listMultiply.apply(input);
                    break;
                case "subtract":
                    input = listSubtract.apply(input);
                    break;
                case "print":
                    printList.accept(input);
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
