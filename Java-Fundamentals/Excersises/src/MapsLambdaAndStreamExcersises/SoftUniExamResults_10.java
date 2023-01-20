package MapsLambdaAndStreamExcersises;

import java.util.*;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        Map<String, List<String>>map=new LinkedHashMap<>();

        List<String>listss=new ArrayList<>();
        while(!input.equals("exam finished")){
           String name=input.split("-")[0];
           String language=input.split("-")[1];
            if(language.equals("banned")){
                map.remove(name);
                input= scanner.nextLine();
                continue;
            }
               String points = input.split("-")[2];

               if (!listss.contains(language)) {
                   listss.add(language);
                   listss.add(String.valueOf(1));
               } else if (listss.contains(language)) {
                   int index = listss.indexOf(language);
                   int newCount = Integer.parseInt(listss.get(index + 1));
                   newCount += 1;
                   listss.remove(index + 1);
                   listss.add(index + 1, String.valueOf(newCount));

               }
               if (map.containsKey(name) && map.get(name).get(0).equals(language)) {
                   int point = Integer.parseInt(map.get(name).get(1));
                   if (Integer.parseInt(points) > point) {
                       map.get(name).add(String.valueOf(point));
                   } else {
                       input = scanner.nextLine();
                       continue;
                   }
               }

               map.put(name, new ArrayList<>());


           map.get(name).add(language);
           map.get(name).add(points);





            input= scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (List list:map.values()){

            }
            System.out.printf("%s | %s%n",entry.getKey(), entry.getValue().get(1));

        }
        System.out.println("Submissions:");
        for (int i = 0; i < listss.size()-1; i+=2) {
            String courseName= listss.get(i);
            String people= listss.get(i+1);
            System.out.printf("%s - %s%n",courseName, people);
        }


        }
    }

