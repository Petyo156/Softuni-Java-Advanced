package _5_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        while(!input.equals("END")){
            String[] arr = input.split(" ");
            Person person = new Person(arr[0],Integer.parseInt(arr[1]),arr[2]);

            personList.add(person);
            input = scanner.nextLine();
        }

        int n = Integer.parseInt(scanner.nextLine());
        Person person = personList.get(n-1);
        personList.remove(person);
        int equals =0;
        for (Person p:personList) {
            int res = p.compareTo(person);
            if(res==0){
                equals++;
            }
        }
        if(equals==0){
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", equals+1, personList.size()-equals, personList.size()+1);
        }
    }
}
