package whileLoopLab;

import java.util.Scanner;

public class ReadText01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //повтарям: прочитам текст + отпечатвам
        //спираме: текст е "Stop"
        //продължавам: текст не е "Stop"
        String text = scanner.nextLine();

        while (!text.equals("Stop")) {
            System.out.println(text);
            text = scanner.nextLine();
        }
    }
}


