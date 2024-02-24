package _6_GenericCountMethodDoubles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Box<Double>> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            double line = Double.parseDouble(scanner.nextLine());
            Box<Double> box = new Box<>(line);
            boxList.add(box);
        }

        Box<Double> doubleBox = new Box<>(Double.parseDouble(scanner.nextLine()));
        int count = compare(boxList,doubleBox);
        System.out.println(count);
    }
    static <T extends Comparable> int compare(List<T> list, T a){
        int count = 0;
        for (T element : list) {
            int res = element.compareTo(a);
            if(res>0){
                count++;
            }
        }
        return count;
    }
}
