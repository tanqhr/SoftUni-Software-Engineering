package MethodsExcersise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        while (!command.equals("END")) {


            System.out.println(isIntegerpalendrom(command));

            command = scanner.nextLine();
        }

    }

    public static boolean isIntegerpalendrom(String num) {

        String reversedNumber = isPalindrome(num);

        return reversedNumber.equals(num);
        }



    public static String isPalindrome(String num) {
        String reversedWord = "";
        for (int i = num.length()- 1; i >= 0; i--) {
            reversedWord += num.charAt(i);


        }return reversedWord;
    }

}