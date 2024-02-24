import java.util.*;

public class _3_commandsList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();

        int numOfCommands = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numOfCommands; i++){
            String[] input = scanner.nextLine().split(" ");
                if (input[0].equals("1")) {
                    int num = Integer.parseInt(input[1]);
                    stack.push(num);
                } else if (input[0].equals("2")) {
                    stack.pop();
                } else if (input[0].equals("3")) {
                    System.out.println(Collections.max(stack));
                }
        }
    }
}
