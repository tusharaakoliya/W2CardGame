public class CardTester {
    public static void main(String args[])
    {
        Card aceOfSpades = new Card("Ace","Spades",14);
        Card twoOfHearts = new Card("Two", "hearts",2);
        twoOfHearts.setSuit("hii");
        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);
    }
}
