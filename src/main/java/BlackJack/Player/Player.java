
package BlackJack.Player;

import BlackJack.Card.Card;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return new ArrayList(hand);
    }
    
    public void addCard(Card card){
        hand.add(card);
    }
    
    public void addCards(List<Card> cards){
        for(Card card : cards){
            addCard(card);
        }
    }
    public String toString(){
        String s = "";
        for (Card c : hand) {
            s += c.toString() + ", ";
        }
        return name + ": [" + s.substring(0, s.length()-2) + "]";
    }
    
    
    
    
}
