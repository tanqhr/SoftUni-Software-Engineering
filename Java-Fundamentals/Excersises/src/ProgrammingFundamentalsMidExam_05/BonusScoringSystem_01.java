package ProgrammingFundamentalsMidExam_05;

import java.util.Scanner;

public class BonusScoringSystem_01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int countStudents=Integer.parseInt(scanner.nextLine());
            int lectures=Integer.parseInt(scanner.nextLine());
            int bonus=Integer.parseInt(scanner.nextLine());
            double maxBonus=0;
            double totalBonus=0;
            int maxAttendances=0;
            while(countStudents>0){
                int studentAttendances=Integer.parseInt(scanner.nextLine());
                if(studentAttendances>maxAttendances){
                    maxAttendances=studentAttendances;
                }
                totalBonus=Math.ceil((studentAttendances)*1.0/lectures*(5+bonus));
                if(totalBonus>maxBonus){
                    maxBonus=totalBonus;
                }

                countStudents--;
            }
            System.out.printf("Max Bonus: %.0f.%n", maxBonus);

            System.out.printf("The student has attended %d lectures.",maxAttendances);
        }
    }


