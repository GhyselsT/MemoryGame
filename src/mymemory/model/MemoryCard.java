package mymemory.model;

import java.util.Objects;

public class MemoryCard extends Card{
    private boolean matched;

    public MemoryCard(String suit, String faceName) {
        super(suit, faceName);
        this.matched = false;

    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    //check if 2 cards are the same that
    //means suit and faceName have to be the same

    public boolean isSameCard(MemoryCard otherCard) {
        //check suit and faceName
        return (this.getSuit().equals(otherCard.getSuit()) &&
                (this.getFaceName().equals(otherCard.getFaceName())));
    }

}
