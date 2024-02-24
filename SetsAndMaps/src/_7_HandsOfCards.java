import java.util.*;

public class _7_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> players = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while(!input.equals("JOKER")){
            String[] arr = input.split(": ");
            String name = arr[0];
            String otherPart = arr[1];

            if(!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }
            Arrays.stream(otherPart.split(", ")).forEach(players.get(name)::add);

            input = scanner.nextLine();
        }

        //P (2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)
        //T (S-4, H-3, D-2, C-1)

        players.forEach((name,cards) -> {
                 int points = calculatePoints(cards);
                 System.out.printf("%s: %d%n", name,points);
                }
                );
    }
    private static int calculatePoints(Set<String> cards){
        int sum = 0;
        for (String card:cards) {
            String[] splitted = card.split("");
            String P = splitted[0];
            String T = splitted[1];
            if(Objects.equals(T, "0")){
                P = "10";
                T = splitted[2];
            }
            P = switch (P) {
                case "J" -> "11";
                case "Q" -> "12";
                case "K" -> "13";
                case "A" -> "14";
                default -> P;
            };
            T = switch (T) {
                case "S" -> "4";
                case "H" -> "3";
                case "D" -> "2";
                case "C" -> "1";
                default -> T;
            };
            int pUsable = Integer.parseInt(P);
            int tUsable = Integer.parseInt(T);

            sum+=pUsable*tUsable;
        }
        return sum;
    }
}
