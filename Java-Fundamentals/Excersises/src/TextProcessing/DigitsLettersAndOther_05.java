package TextProcessing;


import java.util.Scanner;

public class DigitsLettersAndOther_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String word= scanner.nextLine();
            StringBuilder letter=new StringBuilder();
            StringBuilder digit=new StringBuilder();
            StringBuilder others=new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char currentChar=word.charAt(i);
                if(Character.isDigit(currentChar)){
                    digit.append(currentChar);

                }else if (Character.isLetter(currentChar)){
                    letter.append(currentChar);
                }else{
                    others.append(currentChar);
                }


            }

            System.out.println(digit);
            System.out.println(letter);
            System.out.println(others);
        }
    }


