package BasicSyntaxConditionalStatementsLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String word= scanner.nextLine();
            for (int position = word.length()-1; position >=0 ; position--) {
                System.out.print(word.charAt(position));

            }
        }
    }


