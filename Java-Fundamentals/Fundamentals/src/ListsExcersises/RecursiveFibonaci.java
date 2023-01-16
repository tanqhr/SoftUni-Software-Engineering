package ListsExcersises;

import java.util.Scanner;

public class RecursiveFibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int[] array = new int[num];
        if (num>1) {

            array[0] = 1;
            array[1] = 1;

            for (int i = 1; i < num - 1; i++) {
                int number = array[i - 1] + array[i];
                array[i + 1] = number;


            }
            System.out.println(array[array.length - 1]);


        }else{
            System.out.println(1);

        }
        }
    }
