public class CardTester {
    public static void main(String args[])
    {
        Card aceOfSpades = new Card("Ace","Spades",14);
        Card twoOfHearts = new Card("Two", "hearts",2);
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



    }
}
