package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class  MergingList_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num1List=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> num2List=Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> resultList=new ArrayList<>();
        int minSize=Math.min(num1List.size(), num2List.size());
        for (int i = 0; i < minSize; i++) {
            int firstItem = num1List.get(i);
            int secondItem = num2List.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);
        }
        if(num1List.size()> num2List.size()) {
            resultList.addAll(num1List.subList(minSize, num1List.size()));

        }else {
            resultList.addAll(num2List.subList(minSize, num2List.size()));

        }
        System.out.println(resultList.toString().replaceAll("[\\[\\],]",""));
            
        }


    }
