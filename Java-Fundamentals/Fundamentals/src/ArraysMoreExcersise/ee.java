package ArraysMoreExcersise;

import java.util.Scanner;

public class ee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxRows = Integer.parseInt(scanner.nextLine());
        int r = 0;
        int num = 0;
        for (int i = 0; i < maxRows; i++) {
            num = 1;
            r = i + 1;
            int[] arrays = new int[i + 1];
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;

                } arrays[col] = num;

            }
            for (int nums : arrays) {
                System.out.print(nums+" ");

            }
            System.out.println();
        }
    }
}

