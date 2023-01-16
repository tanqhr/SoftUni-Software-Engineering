package ObjectsAndClasses;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

import java.util.Arrays;


public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordList=Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        while(!wordList.isEmpty()){
            Random rnd = new Random();

            int randomInedex=rnd.nextInt(wordList.size());

            String word= wordList.get(randomInedex);

            System.out.println(word);
            wordList.remove(randomInedex);


        }
    }
}
