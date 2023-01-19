package MapsLambdaAndStreamExcersises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cars=Integer.parseInt(scanner.nextLine());
        Map<String, String>map=new LinkedHashMap<>();
        for (int i = 0; i < cars; i++) {
            String input= scanner.nextLine();
            String command=input.split(" ")[0];

            if(command.equals("register")){
                String name=input.split(" ")[1];
                String carNumber=input.split(" ")[2];
                if(!map.containsKey(name)){
                    map.put(name,carNumber);
                    System.out.printf("%s registered %s successfully%n",name, carNumber);
               }else if(map.containsKey(name)){
                    String number=map.get(name);
                    System.out.printf("ERROR: already registered with plate number %s%n",number);

                }

            }else if(command.equals("unregister")){
                String name=input.split(" ")[1];
                if(map.containsKey(name)){
                    System.out.printf("%s unregistered successfully%n",name);
                    String number=map.get(name);
                    map.remove(name,number);
                }else{
                    System.out.printf("ERROR: user %s not found%n",name);

                }
            }

        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());

        }

    }
}
