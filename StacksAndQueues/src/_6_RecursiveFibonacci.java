import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _6_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int num = Integer.parseInt(scanner.nextLine());
        memory = new long[num+1];


        long res = Fibbonaci(num);
        System.out.println(res);
    }
    public static long Fibbonaci(int num)
    {
        if(num<2){return 1;}
        if(memory[num]!=0){return memory[num];}
        memory[num] = Fibbonaci(num-2) + Fibbonaci(num-1);
        return memory[num];
    }

    private static long[] memory;
}
