import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _4_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> queue = new ArrayDeque<>();

        String[] line = scanner.nextLine().split(" ");
        int numOfEl = Integer.parseInt(line[0]);
        int numToPoll = Integer.parseInt(line[1]);
        int ifIsPresent = Integer.parseInt(line[2]);

        String[] numbers = scanner.nextLine().split(" ");

        for (int i=0; i<numOfEl; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }
        for(int i=0; i<numToPoll;i++){
            queue.poll();
        }

        int minEl = Integer.MAX_VALUE;
        if(queue.isEmpty()){
            System.out.println(0);
            return;
        }
        while(!queue.isEmpty()){
            if(minEl>queue.peek()){
                minEl = queue.peek();
            }
            if(ifIsPresent==queue.peek()){
                System.out.println("true");
                return;
            }
            queue.pop();
        }
        System.out.println(minEl);
    }
}
