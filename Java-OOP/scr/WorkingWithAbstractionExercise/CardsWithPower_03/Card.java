package WorkingWithAbstractionExercise.CardsWithPower;

public class Card {
    private CardSuit cardSuit;
    private CardRank cardRank;
    private int power;

    public Card(CardSuit cardSuit, CardRank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }


    public int getPower(){
        return this.cardSuit.getSuit()+this.cardRank.getPowerRank();
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }
}
