package BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class PassedOrFailed_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double grade=Double.parseDouble(scanner.nextLine());
            if (grade>=3){
                System.out.println("Passed!");
            }else if (grade<3){
                System.out.println("Failed!");
            }
        }
    }


