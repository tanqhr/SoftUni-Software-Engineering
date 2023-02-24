package CollectionHierarchy_07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();
        String[] words = scanner.nextLine().split(" ");
        int numberRemoveOperation = Integer.parseInt(scanner.nextLine());
        performAddOperation(words, addCollection);
        performAddOperation(words, addRemoveCollection);
        performAddOperation(words, myList);

        performRemoveOperation(numberRemoveOperation, addRemoveCollection);
        performRemoveOperation(numberRemoveOperation, myList);
    }
        public static void performAddOperation(String[] words, Addable addable){
            for (String word: words) {
                System.out.print(addable.add(word)+" ");
                
            }
            System.out.println();
    }
    public static void performRemoveOperation(int counter, AddRemovable addRemovable){
        for (int i = 0; i <counter ; i++) {
            System.out.print(addRemovable.remove()+ " ");

        }
        System.out.println();
    }
}
