package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double maxValue = 0;
            int number = Integer.parseInt(scanner.nextLine());
            int bestSnowBallSnow=0;
            int bestSnowBallTime=0;
            int bestSnowBallQuality=0;
            for (int i = 0; i < number; i++) {

                int snowBallSnow = Integer.parseInt(scanner.nextLine());
                int snowBallTime = Integer.parseInt(scanner.nextLine());
                int snowBallQuality = Integer.parseInt(scanner.nextLine());
                double value = Math.pow((snowBallSnow / snowBallTime), snowBallQuality);
                if (value > maxValue) {
                    maxValue = value;
                    bestSnowBallSnow=snowBallSnow;
                    bestSnowBallTime=snowBallTime;
                    bestSnowBallQuality=snowBallQuality;


                }
                
            }System.out.printf("%d : %d = %.0f (%d)", bestSnowBallSnow, bestSnowBallTime, maxValue, bestSnowBallQuality);
        }
    }

