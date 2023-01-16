package ArraysExcersise;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        String first = " ";
        String second = " ";
        for (int i = 0; i < input.length; i++) {

            first = input[i];

            for (int j = 0; j < input2.length; j++) {
                second = input2[j];
                if (first.equals(second)) {
                    System.out.print(second + " ");
                }
            }

        }
    }
}
