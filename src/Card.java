import java.util.Arrays;
import java.util.List;

public class Card {
    // These are instance variables , private  variables
    private String faceName, suit;
    private int faceValue;

    /***
     * The goal of constrcot
     */
    public Card(String face, String suit, int faceValue)
    {
        faceName = face;
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        List<String> validSuits = Arrays.asList("hearts","diamonds","spades","clubs");
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid, valid options are: " + validSuits);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }

}
