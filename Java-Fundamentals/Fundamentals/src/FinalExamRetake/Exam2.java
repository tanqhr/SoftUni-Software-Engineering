package FinalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();

        while(!text.equals("Last note")){
            String regex="^(?<name>[A-Za-z0-9!@#$?]+)=(?<length>\\d+)<<(?<code>\\w+)";

            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(text);
            if(matcher.find()){
                StringBuilder name=new StringBuilder();
String names= matcher.group("name");
                for (int i = 0; i < names.length(); i++) {
                    char symbol=names.charAt(i);
                    if(symbol>=48&&symbol<=57||symbol>=65&&symbol<=90||symbol>=97&&symbol<=122){
                        name.append(symbol);
                    }

                }

                int lenght=Integer.parseInt(matcher.group("length"));
                String code= matcher.group("code");
                if(lenght == code.length()){
                    System.out.printf("Coordinates found! %s -> %s%n",name,code);
                }else{
                    System.out.println("Nothing found!");
                }
            }else{
                System.out.println("Nothing found!");
            }


            text= scanner.nextLine();
        }




    }
}
