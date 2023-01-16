package MethodsExcersise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());
        printMatrixOfNumber(number);

    }
    public static void printMatrixOfNumber(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(num+" ");

            }
            System.out.println();

        }

    }
}
