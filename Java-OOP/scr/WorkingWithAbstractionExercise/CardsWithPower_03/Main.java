package WorkingWithAbstractionExercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rank=scanner.nextLine();
        String suits= scanner.nextLine();


        Card card=new Card(CardSuit.valueOf(suits),CardRank.valueOf(rank));
        System.out.printf("Card name: %s of %s; Card power: %d",card.getCardRank(),card.getCardSuit(),card.getPower());
    }
}