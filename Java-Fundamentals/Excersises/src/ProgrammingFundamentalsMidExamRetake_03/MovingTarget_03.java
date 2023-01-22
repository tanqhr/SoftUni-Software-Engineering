package ProgrammingFundamentalsMidExamRetake_03;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MovingTarget_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> list=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

            String command= scanner.nextLine();
            while(!command.equals("End")){
                int index=Integer.parseInt(command.split(" ")[1]);

                if(command.contains("Shoot")) {
                    if (isValidIndex(list, index)) {
                        int power = Integer.parseInt(command.split(" ")[2]);
                        int number = list.get(index);
                        if (number > power) {
                            list.set(index, number - power);
                        } else {
                            list.remove(index);
                        }
                    }
                }else if(command.contains("Add")) {
                    int value = Integer.parseInt(command.split(" ")[2]);
                    if (isValidIndex(list, index)) {
                        list.add(index, value);

                    } else {
                        System.out.println("Invalid placement!");
                    }

                }else if(command.contains("Strike")) {
                    int radius=Integer.parseInt(command.split(" ")[2]);
                    if (isValidIndex(list, index) && index-radius>=0 && index+radius<= list.size()-1) {
                        for (int i = index-radius; i <= index+radius; i++) {
                            list.remove(index-radius);

                        }
                    }else{
                        System.out.println("Strike missed!");

                    }
                }



                command= scanner.nextLine();
            }
            for (int i = 0; i <= list.size()-1; i++) {
                int num=list.get(i);
                if(i== list.size()-1){

                    System.out.print(num);
                    break;
                }
                System.out.print(num+"|");

            }
        }public static boolean isValidIndex(List<Integer>list, int index){
            return index>=0 && index<=list.size()-1;
        }
    }


