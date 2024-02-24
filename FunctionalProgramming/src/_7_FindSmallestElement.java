import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _7_FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elems = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestInt = integers -> {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int i = 0; i < elems.size(); i++) {
                if(min>= elems.get(i)){
                    min = elems.get(i);
                    index = i;
                }
            }
            return index;
        };
        System.out.println(findSmallestInt.apply(elems));
    }
}
