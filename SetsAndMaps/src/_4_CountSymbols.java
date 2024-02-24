import java.util.*;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();

        String input = scanner.nextLine();
        String[] split = input.split("");
        for (int i = 0; i < split.length; i++) {
            map.putIfAbsent(split[i],0);
        }
        for (int i = 0; i < split.length; i++) {
            if(map.containsKey(split[i])){
                map.put(split[i],map.get(split[i])+1);
            }
        }
        for (var entry:map.entrySet()) {
            System.out.printf("%s: %d time/s%n",entry.getKey(),entry.getValue());
        }
    }
}
/*
import java.util.*;

public class _4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> map = new TreeMap<>(); // Use Character as the key type

        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            System.out.printf("%s: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}

 */