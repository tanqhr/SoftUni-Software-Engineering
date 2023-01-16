import java.util.Scanner;

public class ovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int end = a2 - 1;
        int endJ = (n - 1);
        int endK = (n / 2) - 1;
        for (int i = a1; i <= end; i++) {
            if (i % 2 != 0) {
                char symbol = (char) i;
                for (int j = 1; j <= endJ; j++) {
                    for (int k = 1; k <= endK; k++) {

                        if ((i + j + k) % 2 != 0) {


                            System.out.printf("%c-%d%d%d%n", symbol, j, k, i);

                        }

                    }


                }
            }
        }
    }
}