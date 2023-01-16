package ListsExcersises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int command=Integer.parseInt(scanner.nextLine());

        List<String> quests=new ArrayList<>();

        for (int i = 0; i <command ; i++) {
            String input= scanner.nextLine();
            List<String>commandParts=Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String name=commandParts.get(0);
            if(commandParts.size()==3){
                if(quests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    quests.add(name);
                }
                }else if(commandParts.size()==4){
                    if (quests.contains(name)){
                        quests.remove(name);
                    }else{
                        System.out.printf("%s is not in the list!%n", name);
                    }
                }
            }
        for(String name:quests){
            System.out.println(name);

        }
    }
}
