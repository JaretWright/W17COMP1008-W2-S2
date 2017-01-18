
package w17jan18;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class GameOfWar {
    private ArrayList<Card> p1Hand;
    private ArrayList<Card> p2Hand;
    
    public GameOfWar()
    {
        p1Hand = new ArrayList<>();
        p2Hand = new ArrayList<>();
        
        DeckOfCards theDeck = new DeckOfCards();
        theDeck.shuffle();
        
        dealTheCards(theDeck);
    }  //end of the constructor
    
    /**
     * This method will "deal" all of the cards to the players
     */
    private void dealTheCards(DeckOfCards theDeck)
    {
        for (int cardNum=0; cardNum < 52; cardNum++)
        {
            if (cardNum % 2 == 0)
                p1Hand.add(theDeck.dealTopCard());
            else
                p2Hand.add(theDeck.dealTopCard());
        }
    }
    
    
}   //end of the class
