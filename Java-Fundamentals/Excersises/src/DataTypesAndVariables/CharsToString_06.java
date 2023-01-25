package DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString_06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char characterOne=scanner.nextLine().charAt(0);
            char characterTwo=scanner.nextLine().charAt(0);
            char characterThree=scanner.nextLine().charAt(0);

            System.out.printf("%c%c%c", characterOne, characterTwo, characterThree);
        }
    }


