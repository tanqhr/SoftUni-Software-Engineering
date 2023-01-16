package ListMoreExcersise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> resultNums = new ArrayList<>();
        List<Integer> two = new ArrayList<>();
        List<String>all=new ArrayList<>();
        Collections.reverse(list2);
        for (int i = 0; i < Math.min(list.size(), list2.size()); i++) {

            int number = list.get(i);
            resultNums.add(number);

            int number2 = list2.get(i);
            resultNums.add(number2);
        }
        if (list.size() > list2.size()) {
            two.addAll(getRemainingElements(list, list2));
        }else if(list2.size()> list.size()){
            two.addAll(getRemainingElements(list2,list));
        }
        for (int i = 0; i < resultNums.size(); i++) {
            int numbers = resultNums.get(i);
            int num1= two.get(0);
            int num2=two.get(1);
            if (num1 > num2) {
                if (numbers > num2 && numbers < num1) {
                    all.add(String.valueOf(numbers));
                }
            } else {
                if (numbers > num1 && numbers < num2) {
                    all.add(String.valueOf(numbers));
                }
            }
        }Collections.sort(all);
        for (String numb : all) {

            System.out.print(numb+" ");
        }


    }

    public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
        List<Integer> nums = new ArrayList<>();
        for (int i = shorterList.size(); i < longerList.size(); i++) {
            nums.add(longerList.get(i));


        }return nums;
    }
}
