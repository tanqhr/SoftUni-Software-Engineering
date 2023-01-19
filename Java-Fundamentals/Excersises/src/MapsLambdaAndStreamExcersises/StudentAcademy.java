package MapsLambdaAndStreamExcersises;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> map = new LinkedHashMap<>();

        double middleSum = 0;
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            map.putIfAbsent(name, new ArrayList<>());
            map.get(name).add(grade);

        }
        for (Map.Entry<String, List<Double>> entry : map.entrySet()) {
            double sum = 0;
            for (Double num : entry.getValue()) {
                sum += num;
                middleSum = sum / entry.getValue().size();
            }
            if (middleSum >= 4.5) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), middleSum);

            }


        }
    }
}

