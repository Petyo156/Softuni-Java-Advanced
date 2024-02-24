package _4_GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            integers.add(input);
        }
        String[] input = scanner.nextLine().split(" ");
        int idxOne = Integer.parseInt(input[0]);
        int idxTwo = Integer.parseInt(input[1]);
        swap(integers, idxOne, idxTwo);

        integers.forEach(e -> System.out.println(e.getClass().getName() + ": " + e));

    }
    static <T> void swap(List<T> list, int firstIndex, int secondIndex){
        T temp1 = list.get(firstIndex);
        T temp2 = list.get(secondIndex);
        list.set(firstIndex,temp2);
        list.set(secondIndex,temp1);
    }
}
