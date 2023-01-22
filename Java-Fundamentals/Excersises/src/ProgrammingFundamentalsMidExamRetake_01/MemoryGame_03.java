package ProgrammingFundamentalsMidExamRetake_01;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class MemoryGame_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> list=Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
            String input= scanner.nextLine();
            int count=0;
            while(!input.equals("end")){
                count++;
                String[]tokens=input.split("\\s+");
                int firstIndex=Integer.parseInt(tokens[0]);
                int secondIndex=Integer.parseInt(tokens[1]);
                if(firstIndex>=0&&firstIndex<= list.size()-1&&secondIndex>=0&&secondIndex<= list.size()-1&&firstIndex!=secondIndex){
                    String num1= list.get(firstIndex);
                    String num2= list.get(secondIndex);
                    if(num1.equals(num2)){
                        list.remove(firstIndex);
                        if(secondIndex>firstIndex) {
                            list.remove(secondIndex - 1);
                        }else{
                            list.remove(secondIndex);
                        }
                        System.out.printf("Congrats! You have found matching elements - %s!%n", num1);
                    }else{
                        System.out.println("Try again!");
                    }
                }else if(firstIndex<0||firstIndex> list.size()-1||secondIndex<0||secondIndex>list.size()-1||firstIndex==secondIndex){
                    String toAdd=-count+"a";
                    list.add(list.size()/2, toAdd);
                    list.add(list.size()/2,toAdd);
                    System.out.println("Invalid input! Adding additional elements to the board");

                } if(list.isEmpty()){
                    System.out.printf("You have won in %d turns!", count);
                    return;
                }

                input= scanner.nextLine();
            }
            System.out.println("Sorry you lose :(");
            System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        }
    }


