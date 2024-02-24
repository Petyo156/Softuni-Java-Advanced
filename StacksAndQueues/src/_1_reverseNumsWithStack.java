import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _1_reverseNumsWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();

        //int n = Integer.parseInt(scanner.nextLine());
        //for (int i=0; i<n; i++){
        //    int k = Integer.parseInt(scanner.nextLine());
        //    stack.push(k);
        //}

        String[] lines = scanner.nextLine().split(" ");
        for (String line:lines) {
            stack.push(Integer.parseInt(line));
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}
