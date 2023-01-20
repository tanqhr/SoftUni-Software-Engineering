package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String text= scanner.nextLine();
            StringBuilder letters=new StringBuilder(text);
            for (int i = 0; i <letters.length() ; i++) {
                if(i==letters.length()-1){
                    break;
                }
                char letter=letters.charAt(i);
                char letter2=letters.charAt(i+1);
                if(letter==letter2) {

                    letters.deleteCharAt(i);

                    i--;


                }


            }
            System.out.println(letters);
        }
    }

