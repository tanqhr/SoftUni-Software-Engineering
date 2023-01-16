import java.util.Scanner;

public class CarNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        for (int i = startNumber; i <= endNumber; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                for (int k = startNumber; k <= endNumber; k++) {
                    for (int l = startNumber; l <= endNumber; l++) {
                        if ((i % 2 == 0 && l % 2 != 0) || (i % 2 != 0 && l % 2 == 0)) {
                            if ((i > l) && ((j + k) % 2 == 0)) {
                                System.out.printf("%d%d%d%d ", i, j, k, l);

                            }
                        }
                    }

                }

            }
        }
    }
}

