package TextProcessing;




import java.util.Scanner;

public class ReverseStrings_01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String word = scanner.nextLine();

            while (!word.equals("end")) {
                String revercedWord = "";
                for (int i = word.length()-1; i >=0; i--) {
                    revercedWord = revercedWord + word.charAt(i);
                }
                System.out.println(word +" = "+ revercedWord);
                word = scanner.nextLine();
            }
        }
    }


