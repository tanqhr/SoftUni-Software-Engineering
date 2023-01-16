import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int reds = 0;
        int oranges = 0;
        int blues = 0;
        int greens = 0;
        int maxNum=0;
        String maxColor="";
        for (int i = 1; i <= number; i++) {
            String color = scanner.nextLine();
            if (color.equals("red")) {
                reds++;
            if (reds > maxNum) {
                maxNum = reds;
                maxColor = color;

            }
        }else if (color.equals("orange")) {
                oranges++;
                if (oranges > maxNum) {
                    maxNum = oranges;
                    maxColor = color;

                }

            }

            else if (color.equals("blue")) {
                blues++;
                if (blues > maxNum) {
                    maxNum = blues;
                    maxColor = color;

                }

            } else if (color.equals("green")) {
                greens++;
                if (greens > maxNum) {
                    maxNum = greens;
                    maxColor = color;

                }
            }
        }
        System.out.printf("Red eggs: %d%n", reds);
        System.out.printf("Orange eggs: %d%n", oranges);
        System.out.printf("Blue eggs: %d%n", blues);
        System.out.printf("Green eggs: %d%n", greens);
        System.out.printf("Max eggs: %d -> %s", maxNum, maxColor);
    }
}