import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class _2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");

        int n = Integer.parseInt(line[0]);//num els
        int s = Integer.parseInt(line[1]);//pop
        int x = Integer.parseInt(line[2]);//if is still

        String secondLine = scanner.nextLine();
        String[] arg = secondLine.split("\\s+");

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i<n; i++){
            stack.push(Integer.valueOf(arg[i]));
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }

        int minEl = Integer.MAX_VALUE;
        if(stack.isEmpty()){
            System.out.println(0);
            return;
        }
        while(!stack.isEmpty()){
            if(minEl>stack.peek()){
                minEl = stack.peek();
            }
            if(x==stack.peek()){
                System.out.println("true");
                return;
            }
            stack.pop();
        }
        System.out.println(minEl);

    }
}
