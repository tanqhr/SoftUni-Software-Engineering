package whileLoopLab;

import java.util.Scanner;

public class Sequence04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            //While
            //oт 1 до n
            //повтарям: принтирам числото + промяна
            //стоп: число > n
            //продължавам: число <= n
            int number = 1;
            while (number <= n) {
                System.out.println(number);
                number = number * 2 + 1;
            }

            //FOR
            //числа от 1 до n
            //повтарям: принт
            //начало: 1
            //край: n
            //промяна: * 2 + 1
       /* for (int number = 1; number <= n; number = number * 2 + 1) {
            System.out.println(number);
        }*/
        }
    }

