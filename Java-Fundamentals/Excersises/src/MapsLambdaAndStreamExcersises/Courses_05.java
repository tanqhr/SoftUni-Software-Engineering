package MapsLambdaAndStreamExcersises;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> map = new LinkedHashMap<>();
        while (!command.equals("end")) {
            String course = command.split(" : ")[0];
            String name = command.split(" : ")[1];
            if (!map.containsKey(course)) {
                map.put(course, new ArrayList<>());
                map.get(course).add(name);
            } else {
                map.get(course).add(name);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {


            System.out.printf("%s: %d%n-- ", entry.getKey(), entry.getValue().size());
            System.out.println(String.join(System.lineSeparator() + "-- ", entry.getValue()));

        }
    }
}
