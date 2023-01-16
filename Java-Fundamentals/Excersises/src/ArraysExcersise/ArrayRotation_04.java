package ArraysExcersise;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] array= input.split(" ");

        int num = Integer.parseInt(scanner.nextLine());
        for (int j = 1; j <= num; j++) {
            String firstElements = array[0];
            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }
                array[array.length - 1] = firstElements;
            }

                for (String element : array) {

                    System.out.print(element + " ");
                }
            }

        }
