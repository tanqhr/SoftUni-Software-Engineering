import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();
        String word="";
        String withot="";
        while(!command.equals("End")){
           // String letter=command;

            char letter=command.charAt(0);
            if (letter==99) {
            }else if(letter==110) {
            }else if (letter==111){

            }if ((letter>=65&&letter<=90)||(letter>=97&&letter<=122)) {
    word += letter;
}


            command=scanner.nextLine();
        }
        System.out.println();
    }
}
