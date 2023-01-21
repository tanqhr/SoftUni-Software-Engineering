package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_06 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String emails= scanner.nextLine();
            String regex="[A-Za-z0-9]+[._-]?[A-Za-z0-9]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+";

            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(emails);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }


