package BlackJackTest;

import BlackJack.BlackJack;
import BlackJack.Card.Ace;
import BlackJack.Card.Card;
import BlackJack.Card.PipCard;
import BlackJack.Player.Player;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BlackJackTest {
    Player P1 = new Player("Player 1"), 
           P2 = new Player("Player 2"), 
           P3 = new Player("Player 3"), 
           Croupier = new Player("Croupier");
    ArrayList<Card> Deck = new ArrayList<>();
    
    @Test
    public void BlackJack1(){
        Players in = new Players(P1, P2, P3, Croupier, Deck);
        in.Test1();
        assertTrue(BlackJack.isBlackJack(P1.getHand()));
        assertFalse(BlackJack.isBlackJack(P2.getHand()));
        assertFalse(BlackJack.isBlackJack(P3.getHand()));
        assertFalse(BlackJack.isBlackJack(Croupier.getHand()));
    }
    
    @Test
    public void BlackJack2(){
        Players in = new Players(P1, P2, P3, Croupier, Deck);
        in.Test2();
        assertFalse(BlackJack.isBlackJack(P1.getHand()));
        assertFalse(BlackJack.isBlackJack(P2.getHand()));
        assertFalse(BlackJack.isBlackJack(P3.getHand()));
        assertFalse(BlackJack.isBlackJack(Croupier.getHand()));
    }
    
    @Test
    public void BlackJack3(){
        Players in = new Players(P1, P2, P3, Croupier, Deck);
        in.Test3();
        assertTrue(BlackJack.isBlackJack(P1.getHand()));
        assertTrue(BlackJack.isBlackJack(P2.getHand()));
        assertTrue(BlackJack.isBlackJack(P3.getHand()));
        assertTrue(BlackJack.isBlackJack(Croupier.getHand()));
    }
    
    @Test
    public void test_Fill_Croupier_Case1(){
        Players in = new Players(P1, P2, P3, Croupier, Deck);
        in.Test1();
        
        int size1 = Croupier.getHand().size();
        assertTrue(BlackJack.getSumHand(Croupier.getHand())<17);
        
        BlackJack.fillCroupierHand(Croupier, Deck);
        
        int size2 = Croupier.getHand().size();
        assertTrue(BlackJack.getSumHand(Croupier.getHand())>17);
        assertTrue(size1 != size2);
        
        Card[] newHand = new Card[]{new PipCard(9), new PipCard(7), 
            new PipCard(5)};
        for (int i = 0; i < newHand.length; i++) {
            boolean isTrue = newHand[i].equals(Croupier.getHand().get(i));
            assertTrue("Iteración " + i, isTrue);
        }
    }
    
    @Test
    public void test_Fill_Croupier_Case2(){
        Players in = new Players(P1, P2, P3, Croupier, Deck);
        in.Test2();
        
        int size1 = Croupier.getHand().size();
        assertTrue(BlackJack.getSumHand(Croupier.getHand())<17);
        
        BlackJack.fillCroupierHand(Croupier, Deck);
        
        int size2 = Croupier.getHand().size();
        assertTrue(BlackJack.getSumHand(Croupier.getHand())>17);
        assertTrue(size1 != size2);
        
        Card[] newHand = new Card[]{new PipCard(5), new PipCard(10), 
            new Ace(), new PipCard(3)};
        for (int i = 0; i < newHand.length; i++) {
            boolean isTrue = newHand[i].equals(Croupier.getHand().get(i));
            assertTrue("Iteración " + i, isTrue);
        }
    }
    
    @Test
    public void test_Get_Winners_Case1(){
        Players in = new Players(P1, P2, P3, Croupier, Deck);
        in.Test1();
        
        String[] expectedWinners = new String[]{"Player 1"};
        String[] winners = BlackJack.getWinners(P1, P2, P3, Croupier, Deck);

        assertArrayEquals(expectedWinners, winners);
    }
    
    @Test
    public void test_Get_Winners_Case2(){
        Players in = new Players(P1, P2, P3, Croupier, Deck);
        in.Test2();
        
        String[] expectedWinners = new String[]{"Player 1", "Player 3"};
        String[] winners = BlackJack.getWinners(P1, P2, P3, Croupier, Deck);

        assertArrayEquals(expectedWinners, winners);
    }
}
