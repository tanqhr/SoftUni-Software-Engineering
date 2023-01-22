package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countGames = Integer.parseInt(scanner.nextLine());
            double headsetPrise = Double.parseDouble(scanner.nextLine());
            double mousePrice = Double.parseDouble(scanner.nextLine());
            double keyboardPrice = Double.parseDouble(scanner.nextLine());
            double displayPrice = Double.parseDouble(scanner.nextLine());
            double crashHeadset = Math.abs(countGames / 2);
            double crashMouse = Math.abs(countGames / 3);
            //if ()
            double crashKeyboars = Math.abs(countGames / 6);
            double totalPrice = 0;
            double crashDisplay=0;
            if (crashKeyboars >= 2) {
                crashDisplay = Math.floor(crashKeyboars / 2);
            }
            totalPrice = (crashHeadset * headsetPrise) + (crashMouse * mousePrice) + (crashKeyboars * keyboardPrice) + (crashDisplay * displayPrice);
            System.out.printf("Rage expenses: %.2f lv.", totalPrice);
        }
    }


