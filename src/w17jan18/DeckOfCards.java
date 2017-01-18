package w17jan18;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author jwright
 */
public class DeckOfCards {
    private ArrayList<Card> deck;
    
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        
        String[] suits = {"spades","hearts","clubs","diamonds"};
        String[] faceNames = {"two","three","four","five","six","seven","eight",
                              "nine","ten","Jack","Queen","King","Ace"};
        
        for (String suit : suits)
        {
            for (int i=0; i < faceNames.length; i++)
            {
                Card newCard = new Card(faceNames[i], suit, i+2);
                deck.add(newCard);
            }
        }
    }
    
    /**
     * This shuffles the deck of cards
     */
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    
    /**
     * This method will "deal" the top card off the deck
     * and return it to the calling function
     * @return 
     */
    public Card dealTopCard()
    {
        if (deck.size() > 0)
            return deck.remove(0);
        else
            return null;
    }
    
    
    @Override
    public String toString()
    {
        String deckString="";
        for (Card card : deck)
        {
            deckString += card.toString() + "\n";
        }
        return deckString;
    }

}
