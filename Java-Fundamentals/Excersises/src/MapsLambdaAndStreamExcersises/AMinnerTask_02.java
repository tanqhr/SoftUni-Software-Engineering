package MapsLambdaAndStreamExcersises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinnerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map=new LinkedHashMap<>();
        String input= scanner.nextLine();
        while(!input.equals("stop")){
            int count=Integer.parseInt(scanner.nextLine());
            if(!map.containsKey(input)) {
                map.put(input, count);

            }else{
                int currentCount=map.get(input);
                map.put(input, currentCount+count);
            }





            input= scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());

        }

    }
}
