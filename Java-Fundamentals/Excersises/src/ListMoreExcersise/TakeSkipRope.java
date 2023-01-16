package ListMoreExcersise;

import java.util.*;
import java.util.stream.Collectors;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> numbers = new ArrayList<>();
        List<Character> text = new ArrayList<>();
        String get = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                numbers.add(input.charAt(i));
            } else {
                text.add(input.charAt(i));
            }
        }
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();
        for (int j = 0; j < numbers.size(); j++) {
            int num = Character.getNumericValue(numbers.get(j));
            if (j % 2 == 0) {
                takeList.add(num);
            } else {
                skipList.add(num);

            }
        }
        int takeNumber = 0;
        int skipNumber = 0;
        int index = 0;
        String newString = "";

        for (int k = 0; k < takeList.size(); k++) {
            takeNumber = takeList.get(k);
            skipNumber = skipList.get(k);
            if(takeNumber> text.size()){
                takeNumber= text.size();
            }
            for (int i = 0; i < takeNumber; i++) {
                newString += text.get(i);
            }
            int all = takeNumber + skipNumber;
            int count = 0;
            if(all> text.size()){
                all= text.size();
            }
            for (int i = 0; i < all; i++) {
                if (count < all) {
                    text.remove(i);
                    i--;
                    count++;

                }
            }




        } System.out.print(newString);
    }
}