package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class RefactoringPrimeChecker_04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number = Integer.parseInt(scanner.nextLine());

            boolean prime=true;

            for (int i = 2; i <= number; i++) {
                int num=0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        num++;
                    }
                }if (num==2){
                    prime=true;
                }else {
                    prime=false;

                }System.out.printf("%d -> %s%n", i, prime);


            }
        }
    }

