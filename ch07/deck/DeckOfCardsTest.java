// Embaralhando e distribuindo cartas
public class DeckOfCardsTest {
    public static void main(String[] args){
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();

        for (int i = 1; i <= 52; i++){
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if (i % 4 == 0) // Gera uma nova linha após cada quarta de carta
                System.out.println();
        }
    }
}