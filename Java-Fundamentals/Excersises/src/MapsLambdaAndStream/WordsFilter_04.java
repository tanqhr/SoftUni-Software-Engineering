package MapsLambdaAndStream;

import java.util.Scanner;

import static java.util.Arrays.stream;

public class WordsFilter_04 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String[] array = stream(scanner.nextLine().split(" ")).filter(e ->e.length()%2==0).toArray(String[]::new);

    System.out.println(String.join(System.lineSeparator(),array));

}
}