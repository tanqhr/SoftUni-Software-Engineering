package ProgrammingFundamentalsFinalExam_05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String text= scanner.nextLine();
            String[]textsss=text.split("");
            BigInteger sum= BigInteger.valueOf(1);
            List<String> emoji=new ArrayList<>();
            int count=0;
            for (int i = 0; i < textsss.length; i++) {
                if(textsss[i].charAt(0)>=48&&textsss[i].charAt(0)<=57){
                    sum=sum.multiply(BigInteger.valueOf(Integer.parseInt(textsss[i])));
                }

            }
            System.out.printf("Cool threshold: %d%n",sum);
            String regex="([::**]){2}[A-Z][a-z]{2}[a-z]*\\1{2}";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(text);
            while(matcher.find()){
                int sum1=0;
                count++;
                String emojiii= matcher.group();

                emojiii=emojiii.substring(2, emojiii.length()-2);
                for(char symbol:emojiii.toCharArray()){
                    sum1+=symbol;
                }if(sum1>Integer.parseInt(String.valueOf(sum))){
                    emoji.add(matcher.group());
                }
            }
            System.out.printf("%d emojis found in the text. The cool ones are:%n",count);
            for (String name:emoji) {
                System.out.println(name);

            }

        }
    }

