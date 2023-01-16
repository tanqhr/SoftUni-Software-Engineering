package MapsExcersises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text= scanner.nextLine();
        Map<Character,Integer>letters=new LinkedHashMap<>();
        for (char symbol:text.toCharArray()) {
            int countLetters=0;
            if(symbol==' '){
                continue;
            }
            if(!letters.containsKey(symbol)){
                letters.put(symbol,1);
            }else{
                countLetters=letters.get(symbol);
                letters.put(symbol, countLetters+1);
            }


        }
        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());

        }

    }
}
