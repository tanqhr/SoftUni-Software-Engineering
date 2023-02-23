package FoodShortage_04;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyers = new HashMap<>();
        for (int i = 0; i <n ; i++) {
            String[] personInput= scanner.nextLine().split(" ");
            String name=personInput[0];
            int age=Integer.parseInt(personInput[1]);
            Buyer buyer;
            if(personInput.length==4){
                String id=personInput[2];
                String birthday=personInput[3];
                buyer=new Citizen(name,age,id,birthday);


            }else{
                String group=personInput[2];
                buyer = new Rebel(name,age,group);


            }
            buyers.put(name,buyer);

        }
        String nameFromConsole= scanner.nextLine();
        while(!"End".equals(nameFromConsole)){
        Buyer buyer= buyers.get(nameFromConsole);
        if(buyer!=null){
            buyer.buyFood();
        }
            nameFromConsole= scanner.nextLine();

        }
        int totalFood = buyers.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();
        System.out.println(totalFood);

    }
    }
