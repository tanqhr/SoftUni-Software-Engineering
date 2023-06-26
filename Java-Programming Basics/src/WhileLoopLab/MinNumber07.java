package whileLoopLab;

import java.util.Scanner;

public class MinNumber07 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int min = Integer.MAX_VALUE;

            //всяко едно число въведено от конзолата -> проверка дали е минимум
            //повтарям: проверка дали е минимум
            //спирам: въведения ред ми е "Stop"
            //продължава: въведения редн не ми е "Stop"
            String input = scanner.nextLine(); //число под формата на текст или "Stop"
            while (!input.equals("Stop")) {
                //input e число под формата на текст -> "4"
                //число под формата на текст -> цяло число
                int number = Integer.parseInt(input);
                if (number < min) {
                    min = number;
                }
                input = scanner.nextLine();
            }

            System.out.println(min);
        }
    }


