package ProgrammingFundamentalsFinalExamRetake_03;

import java.util.Scanner;

public class SecretChat_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input= scanner.nextLine();
            StringBuilder text=new StringBuilder(input);

            String commands= scanner.nextLine();
            while(!commands.equals("Reveal")){
                if(commands.contains("InsertSpace")) {
                    int index=Integer.parseInt(commands.split(":\\|:")[1]);
                    input= String.valueOf(text.insert(index," "));
                    System.out.println(input);

                }else if(commands.contains("Reverse")){
                    String subString=(commands.split(":\\|:")[1]);
                    if(input.contains(subString)){
                        input=input.replaceFirst(subString,"");
                        text= new StringBuilder(input);
                        StringBuilder newString=new StringBuilder(subString);
                        String newWord= String.valueOf(newString.reverse());
                        text.append(newWord);
                        input= String.valueOf(text);
                        System.out.println(input);
                    }else{
                        System.out.println("error");
                    }
                }else if(commands.contains("ChangeAll")){
                    String subString1=commands.split(":\\|:")[1];
                    String letter=commands.split(":\\|:")[2];
                    if(input.contains(subString1)){
                        input= input.replace(subString1,letter);
                        text= new StringBuilder(input);
                    }System.out.println(input);
                }

                commands= scanner.nextLine();
            }
            System.out.printf("You have a new text message: %s",input);
        }
    }

