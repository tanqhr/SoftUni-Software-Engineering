import java.util.Scanner;

    public class Letter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            String word = "";
            int countN = 0;
            int countC = 0;
            int countO = 0;
            while (!command.equals("End")) {
                // String letter=command;

                char letter = command.charAt(0);
                if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
                }
                if (letter == 99) {
                    countC++;
                } else if (letter == 110) {
                    countN++;
                } else if (letter == 111) {
                    countO++;
                }
                if (countC == 1) {
                    word = word;
                } else if (countN == 1) {
                    word = word;
                } else if (countO == 1) {
                    word = word;
                }

                word += letter;

                command=scanner.nextLine();

        }  System.out.println();
            }

        }


