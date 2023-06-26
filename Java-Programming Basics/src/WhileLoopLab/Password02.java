package whileLoopLab;

import java.util.Scanner;

public class Password02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();
            String password = scanner.nextLine();

            //повтаряме: въвеждаме парола
            //спираме: въведенета парола == password
            //продължаваме: въведената парола != password
            String enteredPassword = scanner.nextLine();

            while (!enteredPassword.equals(password)) {
                enteredPassword = scanner.nextLine();
            }
            //enteredPassword == password
            System.out.println("Welcome " + username + "!");
        }
    }
