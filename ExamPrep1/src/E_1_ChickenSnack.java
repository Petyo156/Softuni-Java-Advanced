import java.util.*;

public class E_1_ChickenSnack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> moneyStack = new Stack<>();
        Deque<Integer> pricesQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(moneyStack::push);

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(pricesQueue::offer);

        int foodCount = 0;
        while(!moneyStack.isEmpty() && !pricesQueue.isEmpty()){
            int money = moneyStack.pop();
            int price = pricesQueue.poll();

            if(money==price){
                foodCount++;
            } else if(money>price){
                foodCount++;
                int change = money-price;
                if(!moneyStack.isEmpty()){
                    int moneyToAdd = change + moneyStack.pop();
                    moneyStack.push(moneyToAdd);
                } else {
                    int moneyToAdd = change;
                    moneyStack.push(moneyToAdd);
                }
            }
        }
        if(foodCount>=4){
            System.out.printf("Gluttony of the day! Henry ate %d foods.%n",foodCount);
        } else if(foodCount==0){
            System.out.println("Henry remained hungry. He will try next weekend again.");
        } else if (foodCount==1){
            System.out.println("Henry ate: " + foodCount + " food.");
        } else {
            System.out.println("Henry ate: " + foodCount + " foods.");
        }
    }
}
