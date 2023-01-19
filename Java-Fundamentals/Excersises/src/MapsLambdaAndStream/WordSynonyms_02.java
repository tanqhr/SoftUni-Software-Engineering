package MapsLambdaAndStream;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms_02 {
        public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
            Map<String, List<String>> wordsMap=new LinkedHashMap<>();
            int n=Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <n ; i++) {
                String word= scanner.nextLine();
                String synonim= scanner.nextLine();
                if(!wordsMap.containsKey(word)){
                    wordsMap.put(word, new ArrayList<>());
                    wordsMap.get(word).add(synonim);

                }else{
                    wordsMap.get(word).add(synonim);
                }



            }
            for (Map.Entry<String, List<String>> entry : wordsMap.entrySet()) {
                System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));

            }

        }
    }

