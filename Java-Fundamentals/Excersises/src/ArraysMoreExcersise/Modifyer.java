package ArraysMoreExcersise;

import java.util.Scanner;
import java.util.Arrays;

public class Modifyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length; i++) {
            int peopleInCabin = array[i];
            int freeSpace = 4 - peopleInCabin;
            if (peopleInCabin == 4) {
                continue;
            }
            if (freeSpace >= countPeople) {
                array[i] = array[i] + countPeople;
                countPeople = 0;
                break;
            }
            array[i] = 4;
            countPeople = countPeople - freeSpace;
        }
        boolean hasEmptySpace=false;

        for (int peopleInCabins:array) {
            if(peopleInCabins<4){
                hasEmptySpace=true;
                break;
            }

        }

        if (hasEmptySpace){
                System.out.println("The lift has empty spots!");

        } else if (!hasEmptySpace&&countPeople!=0) {
            System.out.printf("There isn't enough space! %d people in a queue!", countPeople);
            System.out.println();
        }


                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j] + " ");

                }
            }

        }
