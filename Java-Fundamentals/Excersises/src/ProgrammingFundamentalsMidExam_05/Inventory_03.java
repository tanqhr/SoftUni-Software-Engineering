package ProgrammingFundamentalsMidExam_05;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Inventory_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> list=Arrays.stream(scanner.nextLine().split("\\, ")).collect(Collectors.toList());
            String input= scanner.nextLine();
            while(!input.equals("Craft!")){
                String[]token=input.split("\\ - ");
                String command=token[0];
                String item=token[1];

                switch(command){

                    case "Collect":

                        if(!list.contains(item)){
                            list.add(item);
                        }
                        break;

                    case "Drop":
                        if(list.contains(item)){
                            list.remove(item);
                        }

                        break;

                    case "Combine Items":
                        String[]combi=item.split("\\:");
                        String product1=combi[0];
                        String product2=combi[1];
                        if(list.contains(product1)){
                            int index= list.indexOf(product1);
                            list.add(index+1, product2);
                        }
                        break;


                    case "Renew":
                        if(list.contains(item)){
                            list.remove(item);
                            list.add(item);
                        }
                        break;
                }

                input= scanner.nextLine();
            }
            for (int i = 0; i <= list.size()-1; i++) {
                String items= list.get(i);
                if(i==list.size()-1){
                    System.out.print(items);
                }else{
                    System.out.print(items+", ");
                }

            }




        }
    }

