package ProgrammingFundamentalsMidExamRetake_06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ManOWar_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer>pirateShip= Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer>warShip= Arrays.stream(scanner.nextLine().split("\\>")).map(Integer::parseInt).collect(Collectors.toList());
            int max=Integer.parseInt(scanner.nextLine());
            String input=scanner.nextLine();
            while(!input.equals("Retire")){
                String[]tokens=input.split(" ");
                String command=tokens[0];

                switch (command){
                    case"Fire":
                        int index=Integer.parseInt(tokens[1]);
                        int damage=Integer.parseInt(tokens[2]);
                        if(index>=0&&index<= warShip.size()-1) {
                            int num = warShip.get(index);
                            int newNum = num - damage;
                            if (newNum > 0) {
                                warShip.set(index, newNum);
                            } else {
                                System.out.println("You won! The enemy ship has sunken.");
                                return;
                            }

                        }
                        break;


                    case "Defend":
                        int index1=Integer.parseInt(tokens[1]);
                        int index2=Integer.parseInt(tokens[2]);
                        int damagePirate=Integer.parseInt(tokens[3]);
                        if(index1>=0&&index1<=pirateShip.size()-1&&index2>=0&&index2<=pirateShip.size()-1) {
                            for (int i = index1; i <= index2; i++) {
                                int number = pirateShip.get(i);
                                int newNumber = number - damagePirate;
                                if (newNumber > 0) {
                                    int newNum = number - damagePirate;
                                    pirateShip.set(i, newNum);
                                } else {
                                    System.out.println("You lost! The pirate ship has sunken.");
                                    return;
                                }
                            }
                        }
                        break;

                    case "Repair":
                        int indexs=Integer.parseInt(tokens[1]);
                        int num=Integer.parseInt(tokens[2]);
                        if(indexs>=0&&indexs<=pirateShip.size()-1) {
                            int repair = pirateShip.get(indexs);
                            int afterrepair = repair + num;
                            if (afterrepair <= max) {
                                pirateShip.set(indexs, afterrepair);
                            }else{
                                afterrepair=max;
                                pirateShip.set(indexs,afterrepair);
                            }

                        }


                        break;

                    case "Status":
                        int count=0;
                        for (int i = 0; i <=pirateShip.size()-1 ; i++) {
                            int section=pirateShip.get(i);
                            double capacity=max*0.2;
                            if(section<capacity){
                                count++;
                            }

                        }
                        System.out.printf("%d sections need repair.%n", count);


                        break;



                }input= scanner.nextLine();
            }int sumPirateShip=0;
            for (int i = 0; i <= pirateShip.size()-1; i++) {
                int numbers=pirateShip.get(i);
                sumPirateShip+=numbers;

            }
            System.out.printf("Pirate ship status: %d%n", sumPirateShip);

            int sumWarShip=0;
            for (int i = 0; i <= warShip.size()-1; i++) {
                int numbers = warShip.get(i);
                sumWarShip += numbers;
            }
            System.out.printf("Warship status: %d", sumWarShip);



        }
    }

