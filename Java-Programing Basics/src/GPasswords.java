import java.util.Scanner;

public class GPasswords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int letter = Integer.parseInt(scanner.nextLine());
        ;
        char begin = (97);
        char end = (char) ((97) + letter);
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                for (int k = begin; k < end; k++) {
                    for (int l = begin; l < end; l++) {
                        for (int m = 1; m <= number; m++) {
                            if (m >i && m>j) {
                                System.out.printf("%d%d%c%c%d ", i, j, k, l, m);
                            }

                        }

                    }

                }

            }
        }
    }
}
