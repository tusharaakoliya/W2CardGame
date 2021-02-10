import java.util.ArrayList;

public class CardTester {
    public static void main(String args[])
    {
        Card aceOfSpades = new Card("Ace","Spades");
        Card twoOfHearts = new Card("Two", "hearts");
        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);


        DeckOfCards deck = new DeckOfCards();
        System.out.printf("%nThe Deck of cards has %d cards in it%n", deck.getNumOfCardsInDeck());

        deck.shuffle();

        System.out.println(" here are top 5 cards in deck");
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.printf("%nThe Deck of cards has %d cards in it%n", deck.getNumOfCardsInDeck());

        System.out.println(" here are top 5 cards in deck");
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.printf("%nThe Deck of cards has %d cards in it%n", deck.getNumOfCardsInDeck());


        //little experiment showing why we put datatype's into our List's
        //or other datastructures
        ArrayList genericArrayList = new ArrayList();
        genericArrayList.add(1234);
        genericArrayList.add("Fred");
        genericArrayList.add(aceOfSpades);
        //it assumes that the datatype to be "Object"

        for (int i=0; i<genericArrayList.size(); i++)
            System.out.println(genericArrayList.get(i).getClass());


      //  Card        aceOfSpades    = new Card("ace","spades");
        Card        jesseOfMid     = new Card("ten","Hearts");

        ArrayList<Card> cardArrayList = new ArrayList<>();
        cardArrayList.add(aceOfSpades);
        cardArrayList.add(jesseOfMid);

        for (Card card : cardArrayList)
            System.out.println(card.getFaceName());


    }
}
