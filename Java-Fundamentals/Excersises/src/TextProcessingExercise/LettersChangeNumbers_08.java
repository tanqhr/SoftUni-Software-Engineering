package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String[] password = input.split("\\s+");

            double totalSum = 0;

            for (String passwords : password) {
                double modifiedNumber = getModifiedNumber(passwords);
                totalSum += modifiedNumber;

            }
            System.out.printf("%.2f", totalSum);
        }

        private static double getModifiedNumber(String password) {
            char firstLetter = password.charAt(0);
            char secondLetter = password.charAt(password.length()-1);

            StringBuilder builder = new StringBuilder(password);
            double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length()- 1).toString());

            if (Character.isUpperCase(firstLetter)) {
                int positionUpperLetter = (int) firstLetter - 64;
                number = number / positionUpperLetter;
            } else {
                int positionLowerLetter = (int) firstLetter - 96;
                number = number * positionLowerLetter;
            }
            if (Character.isUpperCase(secondLetter)) {
                int positionUpperLetter = (int) secondLetter -64;
                number = number - positionUpperLetter;

            } else {
                int positionLowerLetter = (int) secondLetter - 96;
                number = number + positionLowerLetter;
            }
            return number;
        }
    }

