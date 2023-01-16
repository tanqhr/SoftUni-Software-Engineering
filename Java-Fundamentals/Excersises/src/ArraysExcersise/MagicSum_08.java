package ArraysExcersise;

import java.util.Scanner;
import java.util.Arrays;
public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int num = Integer.parseInt(scanner.nextLine());
        int number1=0;
        int number2=0;
        for (int i = 0; i < array.length; i++) {
            number1 = array[i];
            for (int j = i+1; j <= array.length - 1; j++) {
                number2 = array[j];
                if (number1 + number2 == num) {
                    System.out.println(number1 + " " + number2);

                }

            }
        }
    }
}