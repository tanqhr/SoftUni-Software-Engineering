package ProgrammingFundamentalsFinalExamRetake_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MirrorWords_02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();
            String regex = "([#|@])(?<word1>[a-zA-Z]{3,})\\1\\1(?<word2>[a-zA-Z]{3,})\\1";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            int count = 0;
            List<String> list = new ArrayList<>();
            while (matcher.find()) {
                count++;
                String word1 = matcher.group("word1");
                String word2 = matcher.group("word2");
                StringBuilder word = new StringBuilder(word2);
                String newword = word.reverse().toString();
                if (word1.equals(newword)) {
                    list.add(word1+" <=> "+word2);

                }
            }
            if (count > 0) {
                System.out.printf("%d word pairs found!%n", count);

            } else {
                System.out.println("No word pairs found!");

            }
            if (list.isEmpty()) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                System.out.println(String.join(", ",list));


            }
        }
    }

