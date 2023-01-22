package BasicSyntaxConditionalStatementsAndLoopsExercise;



import java.util.Scanner;

public class Ages_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int age = Integer.parseInt(scanner.nextLine());
            String type = "";
            //0-2 – baby;
            //3-13 – child;
            //14-19 – teenager;
            //20-65 – adult;
            //>=66 – elder;
            if (age >= 0 && age <= 2) {
                type = "baby";
            }
            if (age >= 3 && age <= 13) {
                type = "child";
            }
            if (age >= 14 && age <= 19) {
                type = "teenager";
            }
            if (age >= 20 && age <= 65) {
                type = "adult";
            }
            if (age >= 66) {
                type = "elder";
            }
            System.out.printf("%s", type);
        }
    }
