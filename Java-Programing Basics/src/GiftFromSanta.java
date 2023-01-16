import java.util.Scanner;

public class GiftFromSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int S = Integer.parseInt(scanner.nextLine());
        int number = 0;

        for (int i = M; i >=N ; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                number = i;
                if(number==S){

                    return;
                }
                System.out.printf("%d ", number);


            }

        }

    }}

