import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _1_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> consumerPrint = s -> System.out.println(s);


        Arrays.stream(scanner.nextLine().split(" ")).forEach(consumerPrint);


        //String[] arr = scanner.nextLine().split(" ");

        //for (String s: arr) {
        //    consumerPrint.accept(s);
        //}
    }
}
