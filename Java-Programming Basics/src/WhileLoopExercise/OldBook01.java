package WhileLoopExercise;

import java.util.Scanner;

public class OldBook01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String wantedBook = scanner.nextLine();

            int countBooks = 0;
            boolean wasFound = false;
            String command = scanner.nextLine();
            while (!command.equals("No More Books")) {
                String currentBook = command;

                if (currentBook.equals(wantedBook)) {
                    wasFound = true;
                    break;
                }

                countBooks++;

                command = scanner.nextLine();
            }

            if (wasFound) {
                System.out.printf("You checked %d books and found it.", countBooks);
            } else {
                System.out.printf("The book you search is not here!%nYou checked %d books.",
                        countBooks);
            }

        }
    }
