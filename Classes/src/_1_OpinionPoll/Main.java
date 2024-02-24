package _1_OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            String[] arr = scanner.nextLine().split(" ");
            Person person = new Person(arr[0],Integer.parseInt(arr[1]));

            personList.add(person);
        }
        personList.stream().filter(person -> person.getAge() > 30)
                .sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);
    }
}
