package mymemory.model;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String suit;
    private String faceName;

    public Card(String suit, String faceName) {
        setSuit(suit);
        setFaceName(faceName);
    }

    public static List<String> getValidSuits() {
        return Arrays.asList("diamonds", "spades", "clubs", "hearts");
    }

    public static List<String> getValidFaceNames() {
        return Arrays.asList("ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king");
    }

    public String getSuit() {
        return suit;
    }


    public void setSuit(String suit) {
        //lowercase
        suit = suit.toLowerCase();
        if (getValidSuits().contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException(suit + "Is not a valid suit must be one of " + getValidSuits());
        }
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        //lowercase again
        faceName = faceName.toLowerCase();
        if (getValidFaceNames().contains(faceName)) {
            this.faceName = faceName;
        }
        else {
            throw new IllegalArgumentException(faceName + "Is not a valid suit must be one of " + getValidFaceNames());
        }
    }

    @Override
    public String toString() {
        return String.format("%s of %s", faceName, suit);
    }

    public String getColor(){
        if (suit.equals("clubs") || suit.equals("spades")){
            return "black";
        }
        else {
            return "red";
        }
    }
    public int getValue() {
        /*"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"
            0    1     2    3    4    5
            so index +1 for real value*/
        return getValidFaceNames().indexOf(faceName) + 1;
    }
}
