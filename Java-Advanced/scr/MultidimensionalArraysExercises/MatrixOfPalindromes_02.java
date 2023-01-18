package multidimensionalArraysExercises;




import java.util.Scanner;

public class MatrixOfPalindromes_02 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            int n = Integer.parseInt(input.split(" ")[0]);
            int n1 = Integer.parseInt(input.split(" ")[1]);


            String[][] matrix = new String[n][n1];
            fillMatrixPattern(matrix);
            printMatrix(matrix);




        }
        private static void printMatrix(String[][] matrix) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    System.out.print(matrix[row][col] + " ");

                }
                System.out.println();
            }
        }


        private static void fillMatrixPattern(String[][] matrix) {
            char rows = 'a';
            char cols = 'a';
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    char firstLetter=(char)('a'+row);
                    char secondLetter=(char)('a'+row+col);
                    matrix[row][col]=""+firstLetter+secondLetter+firstLetter;
                    //  System.out.printf("%c%c%c ", rows, cols, rows);
                    // cols++;
                }


                //rows++;
                // cols = rows;
                //  System.out.println();
            }
        }
    }




