package ProgrammingFundamentalsMidExam_02;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayModifier_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String input = scanner.nextLine();
            while (!input.equals("end")) {
                String[] command = input.split(" ");
                String command1 = command[0];

                switch (command1) {
                    case "swap":

                        int first = Integer.parseInt(command[1]);
                        int second = Integer.parseInt(command[2]);
                        if (first >= 0 && first <= array.length - 1 && second >= 0 && second <= array.length - 1) {
                            int number = array[first];
                            array[first] = array[second];
                            array[second] = number;

                        }
                        break;

                    case "multiply":
                        int first1 = Integer.parseInt(command[1]);
                        int second2 = Integer.parseInt(command[2]);
                        if (first1 >= 0 && first1 <= array.length - 1 && second2 >= 0 && second2 <= array.length - 1) {
                            int num = array[second2] * array[first1];
                            array[first1]=num;

                        }
                        break;


                    case "decrease":
                        for (int i = 0; i < array.length; i++) {
                            int num=array[i]-1;
                            array[i] =num;

                        }


                        break;


                }
                input = scanner.nextLine();

            }
            for (int i = 0; i < array.length; i++) {

                System.out.print(array[i]);
                if (i != array.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }

