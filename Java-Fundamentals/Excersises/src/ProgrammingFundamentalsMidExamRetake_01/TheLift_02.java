package ProgrammingFundamentalsMidExamRetake_01;


import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TheLift_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int people = Integer.parseInt(scanner.nextLine());

            List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            for (int i = 0; i < list.size(); i++) {
                int peopleInWagon = list.get(i);
                while (peopleInWagon < 4 && people > 0) {
                    peopleInWagon++;
                    people--;
                }
                list.set(i, peopleInWagon);


            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 4) {
                    System.out.println("The lift has empty spots!");
                    for (int num : list) {
                        System.out.print(num + " ");


                    }return;
                }

            }
            if (people > 0) {
                System.out.printf("There isn't enough space! %d people in a queue!%n", people);
                for (int num : list) {
                    System.out.print(num + " ");

                }return;

            }
            for (int num : list) {
                System.out.print(num + " ");

            }
        }
    }


