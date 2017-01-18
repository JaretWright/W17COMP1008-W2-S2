package w17jan18;

import java.util.ArrayList;

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
