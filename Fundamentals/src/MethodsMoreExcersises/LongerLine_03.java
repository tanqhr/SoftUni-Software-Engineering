package MethodsMoreExcersises;

import java.io.Console;
import java.util.List;
import java.util.Scanner;

public class LongerLine_03 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double x1 = Double.parseDouble(scanner.nextLine());
            double y1 = Double.parseDouble(scanner.nextLine());
            double x2 = Double.parseDouble(scanner.nextLine());
            double y2 = Double.parseDouble(scanner.nextLine());
            double x3 = Double.parseDouble(scanner.nextLine());
            double y3 = Double.parseDouble(scanner.nextLine());
            double x4 = Double.parseDouble(scanner.nextLine());
            double y4 = Double.parseDouble(scanner.nextLine());

            PrintLongerLine(x1, y1, x2, y2, x3, y3, x4, y4);
        }
    static void PrintLongerLine(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        double firstLineLen = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double secondLineLen = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));

        if (firstLineLen >= secondLineLen) {
            boolean isFirstCloser=closerPoint(x1, y1, x2, y2);
            if (isFirstCloser) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1,x2,y2);
            }
            else
            {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2,x1,y1);
            }
        }
        else {
            boolean isFirstCloser = closerPoint(x3, y3, x4, y4);
            if (isFirstCloser) {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3,x4,y4);

            }
            else {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4,x3,y3);;
            }
        }
    }

    private static boolean closerPoint(double x1, double y1, double x2, double y2) {
        double firstPointLine = Math.sqrt(x1*x1 + y1*y1);
        double secondPointLine = Math.sqrt(x2 * x2 + y2 * y2);
        boolean isFirstCloser = true;
        if (firstPointLine<=secondPointLine) {
            isFirstCloser = true;
        }
        else {
            isFirstCloser = false;
        }
        return isFirstCloser;
    }



    }






