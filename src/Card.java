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
        setFaceName(face);
        setSuit(suit);
        setFaceValue(faceValue);
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * static method return face names
     */
    public static List<String> getFaceNames()
    {
        return Arrays.asList("two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king","ace");
    }
    /**
     * this will ensurte that the face name represents a valid face name.
     * @param faceName - two ,three ,..., ten, jack, queen, king, ace.
     * */
    public void setFaceName(String faceName) {
        faceName = faceName.toLowerCase();
        List<String> validFaceName = getFaceNames();
        if (validFaceName.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " is not valid name, choose form list " + validFaceName);
    }

    public String getSuit() {
        return suit;
    }

    /**
     *
     */

    public static List<String> getSuits() {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    /**
     *
     * */
    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        List<String> validSuits = getSuits();
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid, valid options are: " + validSuits);
    }

    public int getFaceValue() {
        return faceValue;
    }

    /**
     *
     * */
    public void setFaceValue(int faceValue) {
        if (faceValue>=2 && faceValue<=14)
            this.faceValue = faceValue;
        else
            throw new IllegalArgumentException("face value must be 2-14 inclusive");
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }

}
