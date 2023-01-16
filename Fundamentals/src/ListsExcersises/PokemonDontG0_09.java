package ListsExcersises;

import java.util.List;
import java.util.Scanner;
import  java.util.Arrays;
import java.util.stream.Collectors;

public class PokemonDontG0_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (pokemons.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= pokemons.size() - 1) {
                int removedElement = pokemons.get(index);
                sum+=removedElement;
                pokemons.remove(index);
                changeELEMENTS(pokemons, removedElement);

            } else if (index < 0) {
                int removedElementFirst = pokemons.get(0);
                sum += removedElementFirst;
                int lastElement = pokemons.get(pokemons.size() - 1);
                pokemons.set(0, lastElement);
                changeELEMENTS(pokemons, removedElementFirst);
            } else if (index > pokemons.size() - 1) {
                int removedElementLast = pokemons.get(pokemons.size() - 1);
                sum += removedElementLast;
                int firstElement = pokemons.get(0);
                pokemons.set(pokemons.size() - 1, firstElement);
                changeELEMENTS(pokemons, removedElementLast);

            }

        }
        System.out.println(sum);
    }

    public static void changeELEMENTS(List<Integer> distancePokemons, int removedElement) {
        for (int i = 0; i <= distancePokemons.size() - 1; i++) {
            int currentNumber = distancePokemons.get(i);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            distancePokemons.set(i, currentNumber);
        }


    }
}
