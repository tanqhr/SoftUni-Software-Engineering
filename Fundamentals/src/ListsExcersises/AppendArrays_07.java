package ListsExcersises;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        List<String> listSeparatedByPipe=Arrays.stream(input.split("\\|")).collect(Collectors.toList());

        Collections.reverse(listSeparatedByPipe);
        System.out.println(listSeparatedByPipe.toString().replace("[", "")
                .replace("]","")
                .replace("[", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));

}
    }