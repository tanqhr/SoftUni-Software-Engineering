package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProduct_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());
        List<String> listOfProducts=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();

            listOfProducts.add(product);
        }
        Collections.sort(listOfProducts);
        for (int i = 0; i < listOfProducts.size(); i++) {

            System.out.printf("%d.%s%n", i+1, listOfProducts.get(i));

        }
        }
    }

