package ArraysExcersise;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int []array=Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input= scanner.nextLine();
        while(!input.equals("end")) {
            String[] command = input.split(" ");
            String action = command[0];

                switch (action) {
                    case "swap":
                        int index1 = Integer.parseInt(command[1]);
                        int index2 = Integer.parseInt(command[2]);
                        if (index1 >= 0 && index1 <= array.length-1 && index2 >= 0 && index2 <=array.length-1) {
                            int number = array[index1];
                            array[index1] = array[index2];
                            array[index2] = number;
                        }
                        break;
                    case "multiply":
                         index1 = Integer.parseInt(command[1]);
                         index2 = Integer.parseInt(command[2]);
                        if (index1 >= 0 && index1 <= array.length-1 && index2 >= 0 && index2 <=array.length-1) {
                            int number1 = array[index1] * array[index2];
                            array[index1] = number1;
                        }
                        break;


                    case "decrease":
                        for (int i = 0; i < array.length; i++) {
                            int num = array[i] - 1;
                            array[i] = num;
                        }

                        break;

            }
            input=scanner.nextLine();


        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            if(j<array.length-1){
                System.out.print(", ");
            }

        }
    }
}
