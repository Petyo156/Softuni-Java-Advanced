package _6_PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //List<Trainer> trainerList = new ArrayList<>();
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("Tournament")){
            //"{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}"

            String[] arr = command.split(" ");
            String trainerName = arr[0];
            String pokemonName = arr[1];
            String pokemonElement = arr[2];
            int pokemonHealth = Integer.parseInt(arr[3]);

            Pokemon pokemon = new Pokemon(pokemonName,pokemonElement,pokemonHealth);

            Trainer trainer;
            if (trainerMap.containsKey(trainerName)) {
                trainer = trainerMap.get(trainerName);
            } else {
                trainer = new Trainer(trainerName);
            }
            trainer.addPokemon(pokemon);
            trainerMap.putIfAbsent(trainerName, trainer);

            command = scanner.nextLine();
        }
        command = scanner.nextLine();
        while (!command.equals("End")) {
            String element = command;
            trainerMap.values().forEach(trainer -> {
                if (trainer.hasPokemonWithGivenElement(element)) {
                    trainer.increaseBadges();
                } else {
                    trainer.decreaseHealth();
                    trainer.removeDiedPokemons();
                }
            });
            command = scanner.nextLine();
        }
        trainerMap.values()
                .stream().sorted((t1, t2) -> Integer.compare(t2.getNumberOfBadges(), t1.getNumberOfBadges()))
                .forEach(entry -> {
                    System.out.printf("%s %d %d%n", entry.getName(), entry.getNumberOfBadges(), entry.getPokemonList().size());
                });
    }
}
