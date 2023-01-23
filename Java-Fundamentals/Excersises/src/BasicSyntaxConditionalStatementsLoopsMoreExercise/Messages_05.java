package BasicSyntaxConditionalStatementsLoopsMoreExercise;

import java.util.Scanner;

public class Messages_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = Integer.parseInt(scanner.nextLine());
            String word = "";
            for (int i = 1; i <= number; i++) {
                String n = scanner.nextLine();
                int lenght = n.length();
                int main = n.charAt(0);
                int first = Integer.parseInt(String.valueOf(n.charAt(0)));
                int iz = (first - 2) * 3;
                if (first == 8 || first == 9) {
                    iz = (first - 2) * 3 + 1;
                }if (first!=0) {
                    int index = (iz + lenght - 1);
                    char symbol = (char) (index + 97);
                    word += symbol;
                }
                else if (first == 0) {
                    char  symbol = (char) (32);
                    word += symbol;
                }

            }
            System.out.printf("%s", word);
        }
    }


