import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class _2_RepeatingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[] arr = command.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        Set<Integer> Nset = new LinkedHashSet<>();
        Set<Integer> Mset = new LinkedHashSet<>();

        Set<Integer> finalSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            Nset.add(num);
        }
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            Mset.add(num);
        }

        for (Integer N : Nset) {
            for (Integer M : Mset) {
                if(Objects.equals(N, M)){
                    System.out.print(M + " ");
                }
            }
        }

    }
}
