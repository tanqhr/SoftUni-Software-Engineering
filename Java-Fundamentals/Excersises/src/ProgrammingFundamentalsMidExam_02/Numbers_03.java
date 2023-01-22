package ProgrammingFundamentalsMidExam_02;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            List<Integer> newList = new ArrayList<>();
            double middleNumber = 0;
            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                int currentNumber = list.get(i);
                sum += currentNumber;


            }
            middleNumber = sum / list.size();
            for (int i = 0; i < list.size(); i++) {
                int currentNum = list.get(i);
                if (currentNum > middleNumber) {
                    newList.add(currentNum);
                }
            }
            Collections.sort(newList);
            Collections.reverse(newList);
            if(newList.isEmpty()){
                System.out.println("No");
                return;
            }
            for (int i = 0; i <= newList.size()-1; i++) {
                if(i>=5){
                    return;
                }
                int num=newList.get(i);
                System.out.print(num+" ");

            }


        }
    }



