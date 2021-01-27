import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {

    private ArrayList<Card> deck;

    /**
     * the constructor will create the instance of the DeckOfCards
     * class and intialize it with all the card objects
     */
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        // get list of suits and face names
        List<String> suits = Card.getSuits();
        List<String> faceNames = Card.getFaceNames();

        // loop over all the suits and face names to create card objects
        for (String suit : suits)
        {
            for (int i=0;i<faceNames.size();i++)
            {
                Card card = new Card(faceNames.get(i), suit, i+2);
                System.out.println(card);
                deck.add(card);
            }
        }
    }

    /**
     * number of cards in deck
     */
    public int getNumOfCardsInDeck()
    {
        return deck.size();
    }

    /**
     *
     * this method return top card from deck. if deck is empty
     * it will return null.
     */
    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        return null;
    }

    /**
     * Shuffle deck of cards
     */
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
