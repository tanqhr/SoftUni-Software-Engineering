import java.util.Scanner;

public class CombinationNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first=Integer.parseInt(scanner.nextLine());
        int second=Integer.parseInt(scanner.nextLine());
        int number=Integer.parseInt(scanner.nextLine());
        int combinations=0;
        for (int i = first; i <=second ; i++) {

            for (int j = first; j <=second ; j++) {
                combinations++;
                if (i + j == number) {

                    System.out.printf("Combination N:%d (%d + %d = %d)", combinations, i, j, number);
return;
                }

}
            }
            System.out.printf("%d combinations - neither equals %d ", combinations, number);
            
        }
    }
