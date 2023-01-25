package DataTypesAndVariablesExercise;



import java.util.Scanner;
public class PrintPartOfASCIITable_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char start= (char) Integer.parseInt(scanner.nextLine());
            char end= (char) Integer.parseInt(scanner.nextLine());

            for (int i = start; i <=end ; i++) {
                System.out.printf("%c ", i );
            }
        }
    }


