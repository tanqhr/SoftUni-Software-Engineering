package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            char key = (char) Integer.parseInt(scanner.nextLine());
            int numberOfLines = Integer.parseInt(scanner.nextLine());
            String word = "";
            for (int i = 0; i < numberOfLines; i++) {
                String letter = scanner.nextLine();
                char let = (letter.charAt(0));
                char u = (char) (let + key);
                char symbol = 'u';
                System.out.print(u);
            }
        }
    }


