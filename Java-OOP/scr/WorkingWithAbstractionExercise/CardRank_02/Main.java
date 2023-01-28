package WorkingWithAbstractionExercise.CardRank_02;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Ranks:");
        for(CardRank suit:CardRank.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(),suit.toString());
        }
    }
}
