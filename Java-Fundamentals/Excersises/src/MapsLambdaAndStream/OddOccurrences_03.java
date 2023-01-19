package MapsLambdaAndStream;


    import java.util.*;
    import java.util.Scanner;

public class OddOccurrences_03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Map<String, Integer> count=new LinkedHashMap<>();
            String[]input=scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i++) {
                String word=input[i].toLowerCase();
                Integer counts=count.get(word);
                if(count.containsKey(word)){
                    count.put(word, counts+1);
                }else{
                    count.put(word, 1);
                }


            }
            List<String>oddWord=new ArrayList<>();
            for (Map.Entry<String, Integer> entry : count.entrySet()) {
                if(entry.getValue()%2==1){
                    oddWord.add(entry.getKey());

                }


            }
            System.out.println(String.join(", ", oddWord));


        }
    }


