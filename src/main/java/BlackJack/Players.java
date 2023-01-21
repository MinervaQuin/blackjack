package BlackJack;

import BlackJack.Card.Ace;
import BlackJack.Card.Card;
import BlackJack.Card.Figure;
import BlackJack.Card.PipCard;
import BlackJack.Player.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Players {

    Player P1, P2, P3, Croupier;
    List<Card> Deck;
    
    protected Players(Player P1, Player P2,
            Player P3, Player Croupier, List<Card> Deck){
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        this.Croupier = Croupier;
        this.Deck = Deck;
    }
    
    protected void Test1(){
        List<Card> hand = new ArrayList<>();
        hand = Arrays.asList(new PipCard(5), new PipCard(4), 
                new Ace(), new Figure("K"));
        
        P1.addCards(hand);

        hand = Arrays.asList(new PipCard(10), 
                new PipCard(4), new PipCard(7));
        P2.addCards(hand);
       
        hand = Arrays.asList(new Figure("J"), new Ace());
        P3.addCards(hand);
        
        hand = Arrays.asList(new PipCard(8), new PipCard(8));
        Croupier.addCards(hand);
        
        hand = Arrays.asList(new PipCard(6), new PipCard(8), 
                new Figure("K"), new PipCard(2));
        Deck.addAll(hand);
    }
    
    protected void initTest2(){
        List<Card> hand = new ArrayList<>();
        hand = Arrays.asList(new PipCard(9), new PipCard(7),
                new PipCard(5));
        P1.addCards(hand);

        hand = Arrays.asList(new PipCard(10), new Figure("J"));
        P2.addCards(hand);
        hand = Arrays.asList(new PipCard(4), new PipCard(4),
                new PipCard(10));
        
        P3.addCards(hand);
        
        hand = Arrays.asList(new PipCard(7), new PipCard(8));
        Croupier.addCards(hand);
        
        hand = Arrays.asList(new Ace(), new PipCard(3), 
                new Figure("Q"), new PipCard(3)); 
        Deck.addAll(hand);
    }
    
    protected void Test3(){
        List<Card> hand = new ArrayList<>();
        hand = Arrays.asList(new Ace(), new Figure("K"));
        P1.addCards(hand);
        hand = Arrays.asList(new Figure("Q"), new Ace());
        P2.addCards(hand);
        hand = Arrays.asList(new Figure("J"), new Ace());
        P3.addCards(hand);
        hand = Arrays.asList(new PipCard(10), new Ace());
        Croupier.addCards(hand); 
    }
}
