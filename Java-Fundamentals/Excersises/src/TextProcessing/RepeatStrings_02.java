package TextProcessing;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] wordArray = scanner.nextLine().split(" ");
            List<String> resultList = new ArrayList<>();
            for (String s : wordArray) {
                resultList.add(repeatString(s, s.length()));

            }
            System.out.println(String.join("", resultList));
        }

        public static String repeatString(String word, int count) {
            String[] repeatArr = new String[count];
            for (int i = 0; i < count; i++) {
                repeatArr[i] = word;
            }
            return String.join("", repeatArr);


        }
    }

