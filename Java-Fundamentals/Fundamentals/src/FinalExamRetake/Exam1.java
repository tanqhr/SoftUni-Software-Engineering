package FinalExamRetake;

import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        String input= scanner.nextLine();

        while(!input.equals("Easter")){
String [] tokens=input.split("\\s+");
String command=tokens[0];

switch (command){
    case "Replace":

char symbol=tokens[1].charAt(0);
char newSymbol=tokens[2].charAt(0);
text=text.replace(symbol,newSymbol);
        System.out.println(text);

        break;


    case "Remove":
String substring=tokens[1];
text=text.replaceAll(substring,"");
        System.out.println(text);
        break;


    case "Includes":
String includesSubstring=tokens[1];
if(text.contains(includesSubstring)){
    System.out.println("True");
}else{
    System.out.println("False");
}


        break;


    case "Change":
String type= tokens[1];

if(type.equals("Lower")){
    text=text.toLowerCase();
    System.out.println(text);

}else if(type.equals("Upper")){

    text=text.toUpperCase();
    System.out.println(text);
}


        break;


    case "Reverse":
        int startIndex=Integer.parseInt(tokens[1]);
        int endIndex=Integer.parseInt(tokens[2]);
        if(startIndex>=0&&endIndex<=text.length()-1){
String substringToReverse=text.substring(startIndex,endIndex+1);
            StringBuilder text1=new StringBuilder(substringToReverse);
            System.out.println(text1.reverse());

        }




        break;
}




            input= scanner.nextLine();
        }









    }
}
