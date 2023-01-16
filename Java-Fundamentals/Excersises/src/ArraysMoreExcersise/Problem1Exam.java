package ArraysMoreExcersise;

import java.util.Scanner;

public class Problem1Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double answeredForHour = first + second + third;
double countHours=0;
        while (students > 0) {
            students-=answeredForHour;
            countHours++;
            if (countHours % 4 == 0) {
                countHours++;
            }
        }
                System.out.printf("Time needed: %.0fh.", countHours);

            }

        }
