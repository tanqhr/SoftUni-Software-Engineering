package RegularExpressions;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String regex="\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";

            String numbers= scanner.nextLine();
            List<String> listNumbers=new ArrayList<>();
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher= pattern.matcher(numbers);

            while(matcher.find()){
                listNumbers.add(matcher.group());
            } System.out.println(String.join(", ",listNumbers));
        }
    }


