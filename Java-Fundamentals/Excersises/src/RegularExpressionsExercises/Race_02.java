package RegularExpressionsExercises;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String names= scanner.nextLine();
            List<String>racersNames=Arrays.stream(names.split(", ")).collect(Collectors.toList());
            Map<String,Integer>racersDidtances=new LinkedHashMap<>();
            racersNames.forEach(name->racersDidtances.put(name,0));

            String regexLetters="[A-Za-z]+";
            Pattern patternLetter=Pattern.compile(regexLetters);
            String regexDigit="[0-9]";
            Pattern patternDigit=Pattern.compile(regexDigit);

            String input= scanner.nextLine();

            while(!input.equals("end of race")){
                StringBuilder nameBulder=new StringBuilder();
                Matcher matcherLetter=patternLetter.matcher(input);
                while(matcherLetter.find()){
                    nameBulder.append(matcherLetter.group());
                }
                int distance=0;
                Matcher matcherDigit=patternDigit.matcher(input);
                while(matcherDigit.find()){
                    distance+=Integer.parseInt(matcherDigit.group());

                }
                String racerName=nameBulder.toString();
                if(racersDidtances.containsKey(racerName)){
                    int currentDistance=racersDidtances.get(racerName);
                    racersDidtances.put(racerName,currentDistance+distance);
                }
                input= scanner.nextLine();
            }

            List<String> nameOfFirstTree = racersDidtances.entrySet().stream().
                    sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).
                    limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());
            System.out.println("1st place: " + nameOfFirstTree.get(0));
            System.out.println("2nd place: " + nameOfFirstTree.get(1));
            System.out.println("3rd place: " + nameOfFirstTree.get(2));

        }
    }




