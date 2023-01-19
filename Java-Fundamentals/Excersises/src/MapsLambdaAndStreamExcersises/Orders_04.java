package MapsLambdaAndStreamExcersises;

import java.util.*;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        Map<String,List<Double>>map=new LinkedHashMap<>();
        while(!input.equals("buy")){
            String product=input.split(" ")[0];
            double price=Double.parseDouble(input.split(" ")[1]);
            double quality=Double.parseDouble(input.split(" ")[2]);

            if(!map.containsKey(product)){
                map.put(product, new ArrayList<>());
                map.get(product).add(price);
                map.get(product).add(quality);


            }else{
               List<Double> currentPrice= map.get(product);
               double currentPrices= currentPrice.get(0);
               double currentQuality=currentPrice.get(1);
               currentPrice.set(0,price);
               currentPrice.set(1,quality+currentQuality);
               map.put(product,currentPrice);



            }
            input=scanner.nextLine();
        }
        for (Map.Entry<String,List<Double>> entry : map.entrySet()) {
double pricess=entry.getValue().get(0);
double gualities=entry.getValue().get(1);
double sum=pricess*gualities;
            System.out.printf("%s -> %.2f%n", entry.getKey(),sum );
        }

    }
}
