package TextProcessingExercise;


import java.util.Scanner;

public class CaesarCipher_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input= scanner.nextLine();
            StringBuilder caeserWord=new StringBuilder();
            for (char symbol:input.toCharArray()) {
                char newSymbol=(char)(symbol+3);
                caeserWord.append(newSymbol);


            }
            System.out.println(caeserWord);
        }
    }


