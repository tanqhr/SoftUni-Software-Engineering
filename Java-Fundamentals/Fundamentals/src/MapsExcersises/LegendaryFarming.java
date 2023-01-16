package MapsExcersises;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Integer> items=new LinkedHashMap<>();
        items.put("shards",0);
        items.put("fragments",0);
        items.put("motes",0);

        Map<String,Integer>junkItems=new LinkedHashMap<>();
boolean isWin=false;
while(!isWin){
        String input= scanner.nextLine();
        String[]inputData=input.split(" ");

        for (int i = 0; i < inputData.length-1 ; i+=2) {
            int quality= Integer.parseInt(inputData[i]);
            String material=inputData[i+1].toLowerCase();

            if(material.equals("shards")||material.equals("fragments")||material.equals("motes")){
                int currentQuality=items.get(material);
                items.put(material, currentQuality+quality);
            }else{
                if(!junkItems.containsKey(material)){
                    junkItems.put(material, quality);
                }else{
                    int current=junkItems.get(material);
                    junkItems.put(material, current+quality);
                }
            }
            if(items.get("shards")>=250){
                System.out.println("Shadowmourne obtained!");
                items.put("shards", items.get("shards")-250);
                isWin=true;
                break;
            }else if (items.get("fragments")>=250){
                System.out.println("Valanyr obtained!");
                items.put("fragments", items.get("fragments")-250);
                isWin=true;
                break;
            }else if (items.get("motes")>=250){
                System.out.println("Dragonwrath obtained!");
                items.put("motes", items.get("motes")-250);
                isWin=true;
                break;
            }

}if(isWin) {
        break;
    }



            } for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : junkItems.entrySet()) {
            System.out.println(stringIntegerEntry.getKey()+": "+stringIntegerEntry.getValue());

        }


    }
    }
