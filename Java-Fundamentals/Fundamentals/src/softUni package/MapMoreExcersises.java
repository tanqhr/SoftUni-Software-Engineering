import java.util.*;
import java.util.stream.Collectors;

public class MapMoreExcersises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> map = new LinkedHashMap<>();
        String best = "";
        int bestPoints = 0;
        while (!input.equals("end of contests")) {
            String course = input.split(":")[0];
            String name = input.split(":")[1];
            map.put(course, name);

            input = scanner.nextLine();
        }
        boolean isTrue = false;
        String commands = scanner.nextLine();
        Map<String, List<String>> listMap = new TreeMap<>();
        List<String> list = new ArrayList<>();
        while (!commands.equals("end of submissions")) {
            String currentCourse = commands.split("=>")[0];
            String currentPassword = commands.split("=>")[1];
            String name = commands.split("=>")[2];
            String points = commands.split("=>")[3];

            for (Map.Entry<String, String> entry : map.entrySet()) {
                int pointsss = 0;
                if (entry.getKey().equals(currentCourse) && entry.getValue().equals(currentPassword)) {
                    if (!listMap.containsKey(name)) {
                        listMap.put(name, new ArrayList<>());
                        listMap.get(name).add(currentCourse);
                        listMap.get(name).add(points);
                        pointsss += Integer.parseInt(points);
                        list.add(name);
                        list.add(String.valueOf(pointsss));

                    } else {
                        for (Map.Entry<String, List<String>> listEntry : listMap.entrySet()) {
                            if (listEntry.getKey().equals(name)) {
                                String[] values = listEntry.getValue().toArray(new String[0]);
                                for (int i = 0; i < values.length; i += 2) {
                                    String nameName = listMap.get(name).get(i);
                                    int countCount = Integer.parseInt(listMap.get(name).get(i + 1));
                                    if (listMap.get(name).get(i).equals(currentCourse)) {
                                        isTrue = true;
                                        if (Integer.parseInt(listMap.get(name).get(i + 1)) < Integer.parseInt(points)) {
                                            listMap.get(name).add(i + 1, points);
                                            int indexName = list.indexOf(name);
                                            pointsss = Integer.parseInt(list.get(indexName + 1));
                                            pointsss += Integer.parseInt(points) - Integer.parseInt(listMap.get(name).get(i + 1));
                                            list.set(indexName + 1, String.valueOf(pointsss));
                                            break;

                                        }


                                    }
                                }
                                if (!isTrue) {
                                    listMap.get(name).add(currentCourse);
                                    listMap.get(name).add(points);
                                    int indexName = list.indexOf(name);
                                    pointsss = Integer.parseInt(list.get(indexName + 1));
                                    pointsss += Integer.parseInt(points);
                                    list.set(indexName + 1, String.valueOf(pointsss));
                                    break;
                                }
                            }
                            isTrue = false;
                        }


                    }
                }
            }
            commands = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i += 2) {
            int totalPoint = Integer.parseInt(list.get(i + 1));
            if (totalPoint > bestPoints) {
                bestPoints = totalPoint;
                best = list.get(i);
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", best, bestPoints);
        System.out.println("Ranking: ");

        for (Map.Entry<String, List<String>> entry : listMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            List<String> num = entry.getValue();

            Map<Integer, String> nums = new TreeMap<Integer, String>(Collections.reverseOrder());

            for (int i = 0; i < num.size(); i += 2) {
                int numss = Integer.parseInt(entry.getValue().get(i + 1));
                String coursess = entry.getValue().get(i);
                nums.put(numss, coursess);
            }
            for (Map.Entry<Integer, String> stringEntry : nums.entrySet()) {

                System.out.printf("#  %s -> %d%n", stringEntry.getValue(), stringEntry.getKey());
            }

        }
    }
}



