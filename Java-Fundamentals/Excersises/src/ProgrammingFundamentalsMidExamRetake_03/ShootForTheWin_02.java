package ProgrammingFundamentalsMidExamRetake_03;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ShootForTheWin_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer>list=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            String command= scanner.nextLine();
            int count=0;
            while(!command.equals("End")){
                int index=Integer.parseInt(command);
                if(index>=0&&index<= list.size()-1){
                    int num=list.get(index);
                    for (int i = 0; i < list.size() ; i++) {

                        int number=list.get(i);
                        if(number>num&&number!=-1){
                            list.set(i,number-num);
                        }else if (number!=-1){
                            list.set(i,number+num);
                        }
                    }
                    list.set(index,-1);
                    count++;

                }




                command=scanner.nextLine();
            }
            System.out.printf("Shot targets: %d -> ", count);
            for (int num:list) {
                System.out.print(num+" ");
            }

        }
    }


