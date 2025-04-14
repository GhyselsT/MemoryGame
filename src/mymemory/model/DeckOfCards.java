package mymemory.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<Card> deck;

    public DeckOfCards() {
        this.deck = new ArrayList<>();
        //get the valid suits using the public function in Card
        List<String> suits = Card.getValidSuits();
        //get the valid faceNames using the public function in Card
        List<String> faceNames = Card.getValidFaceNames();

        //make the cards for the deck
        for (String suit : suits)
        {
            for (String faceName : faceNames)
            {
                deck.add(new Card(suit,faceName));
            }
        }
    }

    //shuffle all the cards in the deck
    public void shuffle(){
        Collections.shuffle(deck);
    }

    //deal top of deck if deck is empty return null;
    public Card dealTopCard(){
        //check if deck isnot empty
        if (!deck.isEmpty()){
            //give me the card and remove it form the deck
            return deck.remove(0);
        }
        else {
            return null;
        }
    }

    //Not needed for this game I just realised
    //numberOfCars left
    public int numberOfCards(){
        return deck.size();
    }
}
