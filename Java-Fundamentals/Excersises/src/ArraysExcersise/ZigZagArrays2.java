package ArraysExcersise;

import java.util.Scanner;

public class ZigZagArrays2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[n];
        String[] array2 = new String[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstNumber = input.split(" ")[0];
            String secondNumber = input.split(" ")[1];
            if ((i + 1) % 2 == 1) {
                array1[i] = firstNumber;
                array2[i] = secondNumber;
            } else {
                array1[i] = secondNumber;
                array2[i] = firstNumber;
            }
        }
        for (String element : array1) {
            System.out.print(element + " ");
        }
        System.out.println();
        for(String element:array2){
            System.out.print(element+" ");
        }

    }
}
