package ArraysMoreExcersise;

import java.util.Scanner;
import java.util.Arrays;
public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[number];

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            int inputLength = input.length();
            int sum = 0;

            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                switch (currentChar){
                    case 'a': case 'e': case 'i': case 'o': case 'u':
                    case 'A': case 'E': case 'I': case 'O': case 'U':
                        sum += currentChar * inputLength;
                        break;
                    default:
                        sum += currentChar / inputLength;
                        break;
                }
            }
            numbers[i] = sum;


        }
        Arrays.sort(numbers);
        for (int print : numbers) {
            System.out.println(print);
        }
    }
}
