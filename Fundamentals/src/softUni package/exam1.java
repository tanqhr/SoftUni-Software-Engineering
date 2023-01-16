import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",\\s+");

        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            matrix[row] = scanner.nextLine().replaceAll(" ", "").toCharArray();
        }
        int phytonRow = 0;
        int phytonCol = 0;
        int countFood = 0;
        int lenghtPython = 1;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (matrix[row][col] == 's') {
                    phytonRow = row;
                    phytonCol = col;

                }
                if (matrix[row][col] == 'f') {
                    countFood++;
                }

            }

        }
        for (String command : commands) {
            matrix[phytonRow][phytonCol] = '*';
            switch (command) {

                case "left":
                    phytonCol--;
                    break;
                case "right":
                    phytonCol++;
                    break;

                case "up":
                    phytonRow--;
                    break;

                case "down":
                    phytonRow++;
                    break;
            }
                if (phytonRow < 0 || phytonRow >= n) {
                    if (phytonRow < 0) {
                        phytonRow = n - 1;
                    } else {
                        phytonRow = 0;
                    }
                }
                if (phytonCol < 0 || phytonCol >= n) {
                    if (phytonCol < 0) {
                        phytonCol = n - 1;
                    } else {
                        phytonCol = 0;
                    }
                }
                if (matrix[phytonRow][phytonCol] == 'e') {
                    System.out.println("You lose! Killed by an enemy!");
                    return;
                } else if (matrix[phytonRow][phytonCol] == 'f') {
                    lenghtPython++;
                    countFood--;
                    if (countFood == 0) {
                        System.out.printf("You win! Final python length is %d", lenghtPython);
                        return;
                    }
                }
                matrix[phytonRow][phytonCol] = 's';
            }
        System.out.printf("You lose! There is still %d food to be eaten.",countFood);


        }
        }

