package MethodsExcersise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word= scanner.nextLine();
        printMiddleCharacters(word);
    }

    private static void printMiddleCharacters(String word) {
        if(word.length()%2!=0){
            int middleCharacter=word.length()/2;
            System.out.println(word.charAt(middleCharacter));
        }else{
            int firstMiddleCharacter=word.length()/2-1;
            int secondMiddleCharacter=word.length()/2;
            System.out.println(word.charAt(firstMiddleCharacter)+""+word.charAt(secondMiddleCharacter));
        }
    }
}
