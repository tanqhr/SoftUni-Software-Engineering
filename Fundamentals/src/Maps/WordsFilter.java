package Maps;

import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.stream;

public class WordsFilter {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String[] array = stream(scanner.nextLine().split(" ")).filter(e ->e.length()%2==0).toArray(String[]::new);

    System.out.println(String.join(System.lineSeparator(),array));

}
}