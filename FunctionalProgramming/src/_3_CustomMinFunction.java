import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _3_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> findMin =
                arr -> Arrays.stream(arr).min(Integer::compareTo).get();
        //{
        //    int min = Integer.MAX_VALUE;
        //    for (int num: integers) {
        //        if(num<min){
        //            min = num;
        //        }
        //    }
        //    return min;
        //};

        Integer[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        System.out.println(findMin.apply(arr));


    }
}
