package FinalExamRetake;

import java.util.*;

public class Exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        Map<String, List<Integer>>map=new LinkedHashMap<>();
        while(!text.equals("Results")){
String[]input=text.split(":");
String command=input[0];
switch (command){

    case "Add":
        String person=input[1];
        int health=Integer.parseInt(input[2]);
        int energy=Integer.parseInt(input[3]);
        if(map.size()==0||(!map.containsKey(person))){
            map.put(person,new ArrayList<>());
            map.get(person).add(health);
            map.get(person).add(energy);
    }else if(map.containsKey(person)){
          int currentHealth=  map.get(person).get(0);
          map.get(person).set(0,currentHealth+health);
        }

        break;



    case "Attack":
        String attackerName=input[1];
        String defenderName=input[2];
        int damage=Integer.parseInt(input[3]);
        if(map.containsKey(attackerName)&& map.containsKey(defenderName)) {
            int currentHealth = map.get(defenderName).get(0);
            map.get(defenderName).set(0, currentHealth - damage);

            int currentEnergy = map.get(attackerName).get(1);
            map.get(attackerName).set(1, currentEnergy - 1);
            if (map.get(defenderName).get(0)<=0){
                map.remove(defenderName);
                System.out.printf("%s was disqualified!%n",defenderName);
            }if(map.get(attackerName).get(1)<=0){
                map.remove(attackerName);
                System.out.printf("%s was disqualified!%n",attackerName);
            }

        }

        break;



    case "Delete":

String username=input[1];
if(map.containsKey(username)){
    map.remove(username);
}if(username.equals("All")){
    map.clear();
    }

        break;
}




            text= scanner.nextLine();
        }
        System.out.printf("People count: %d%n",map.size());
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            System.out.printf("%s - %d - %d%n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));


        }


    }
}
