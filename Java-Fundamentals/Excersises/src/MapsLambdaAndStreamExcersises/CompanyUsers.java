package MapsLambdaAndStreamExcersises;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String company = input.split(" -> ")[0];
            String number = input.split(" -> ")[1];
            map.putIfAbsent(company, new ArrayList<>());
            if (!map.get(company).contains(number)) {
                map.get(company).add(number);



            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            System.out.printf("%s%n",stringListEntry.getKey());
            for (String num:stringListEntry.getValue()){
                System.out.println("-- "+num);


            }
        }

    }
}