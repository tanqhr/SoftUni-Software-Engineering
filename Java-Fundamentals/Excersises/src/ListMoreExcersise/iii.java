package ListMoreExcersise;

import java.util.List;
import java.util.Scanner;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class iii {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> list = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
            List<Integer> number = new ArrayList<>();
            List<String> text = new ArrayList<>();
            List<Integer> takeList = new ArrayList<>();
            List<Integer> skipList = new ArrayList<>();
            String get = "";
            for (int i = 0; i < list.size(); i++) {
                String letter = list.get(i);

                if (letter.equals("1") || letter.equals("2") || letter.equals("3") || letter.equals("4") ||
                        letter.equals("5") || letter.equals("6") || letter.equals("7") || letter.equals("8") ||
                        letter.equals("9") || letter.equals("0")) {

                    number.add(Integer.valueOf(letter));
                } else {

                    text.add(letter);
                }


            }
            for (int i = 0; i < number.size(); i++) {
                int num = number.get(i);
                if (i % 2 == 0) {
                    takeList.add(num);
                } else {
                    skipList.add(num);
                }
            }
            for (int i = 0; i < takeList.size(); i++) {
                int index = takeList.get(i);
                if (index > text.size()) {
                    index = text.size();
                }
                int count = 0;

                for (int j = 0; j < index; j++) {
                        get += text.get(j);
                    }
                int removeIndex = index+skipList.get(i);
                int coun2 = 0;
            if (removeIndex > text.size()) {
                removeIndex = text.size();

            }
                for (int k = 0; k < removeIndex; k++) {
                    if(coun2<removeIndex){
                        text.remove(k);
                        k --;
                        coun2++;

                    }

                }
            }

            System.out.print(get);


        }
    }


