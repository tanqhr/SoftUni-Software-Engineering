package Maps;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble)
                        .collect(Collectors.toList());

        Map<Double,Integer> numbersMap=new TreeMap<>();

        for (double currentNum:numList) {
            Integer value=numbersMap.get(currentNum);
            if(numbersMap.containsKey(currentNum)){
                numbersMap.put(currentNum, value+1);

        }else{
                    numbersMap.put(currentNum,1);
                }

        }
        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());

        }


    }
}
