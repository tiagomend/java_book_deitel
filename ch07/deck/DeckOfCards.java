// Representa um baralho de cartas
import java.security.SecureRandom;

public class DeckOfCards
{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom();

    public DeckOfCards(){
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };    
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        // Preenche o baralho com objetos Card
        // count % 13 resulta em um valor de 0 a 12
        // count / 13 resulta em um valor de 0 a 3
        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }

    // Embaralha as cartas com um algoritmo de uma passagem
    public void shuffle(){
        // A próxima chamada para o método dealCard dever começar no deck[0] novamente
        currentCard = 0;

        for (int first = 0; first < deck.length; first++)
        {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){
        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}