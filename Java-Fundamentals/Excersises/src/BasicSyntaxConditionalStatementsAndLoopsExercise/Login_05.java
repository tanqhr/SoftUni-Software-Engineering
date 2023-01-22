package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String username = scanner.nextLine();
            String input = scanner.nextLine();
            String password = "";
            int incorrect = 0;
            for (int position = username.length() - 1; position >= 0; position--) {

                password += username.charAt(position);

            }
            while (!input.equals(password)) {
                incorrect++;
                if(incorrect==4) {
                    System.out.printf("User %s blocked!", username);
                    return;
                }else{
                    System.out.println("Incorrect password. Try again.");

                    input = scanner.nextLine();

                }if (input.equals(password)){
                    System.out.printf("User %s logged in.", username);


                }
            }
        }
    }
