package ArraysMoreExcersise;

import java.util.Scanner;

public class uuu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxRows=Integer.parseInt(scanner.nextLine());
        int r=0;
        int num=0;
        for (int i = 0; i < maxRows; i++) {
            num = 1;
            r = i + 1;
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
