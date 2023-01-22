package BasicSyntaxConditionalStatementsLoopsMoreExercise;

import java.util.Scanner;

public class SortNumbers_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int i = Integer.parseInt(scanner.nextLine());
            int j = Integer.parseInt(scanner.nextLine());
            int k = Integer.parseInt(scanner.nextLine());

            if (k >= j && k >= i && j >= i) {
                System.out.println(k);
                System.out.println(j);
                System.out.println(i);
            } if (k > j && k > i && i > j) {
                System.out.println(k);
                System.out.println(i);
                System.out.println(j);

            } if (j >= k && j >= i && k >= i) {
                System.out.println(j);
                System.out.println(k);
                System.out.println(i);
            }  if (j > k && j > i && i > k) {
                System.out.println(j);
                System.out.println(i);
                System.out.println(k);
            } else if (i >= k && i >= j && k >= j) {
                System.out.println(i);
                System.out.println(k);
                System.out.println(j);
            } if (i > k && i > j && j > k) {
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);

            }
        }
    }

