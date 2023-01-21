package BlackJack;

import BlackJack.Card.Card;
import BlackJack.Player.Player;
import java.util.ArrayList;

public class Main {
        public static void main(String[] args) {
        System.out.println("##Casos");
        case1();
        System.out.println("\n\n");
        case2();
    }
    
    private static void case1(){
        Player P1 = new Player("Player 1"), 
           P2 = new Player("Player 2"), 
           P3 = new Player("Player 3"), 
           croupier = new Player("Croupier");
        ArrayList<Card> deck = new ArrayList<>();
        
        
        System.out.println("###Caso 1");
        Players init = new Players(P1, P2, P3, croupier, deck);
        init.Test1();
        
        System.out.println(P1.toString() + "(" + BlackJack.getSumHand(P1.getHand()) + ")");
        System.out.println(P2.toString() + "(" +  BlackJack.getSumHand(P2.getHand()) + ")");
        System.out.println(P3.toString() + "(" +  BlackJack.getSumHand(P3.getHand()) + ")");
        System.out.println(croupier.toString() + "(" +  BlackJack.getSumHand(croupier.getHand()) + ")");

        System.out.println("Deck: " + deck.toString() + "\n");
        
        String[] winners = BlackJack.getWinners(P1, P2, P3, croupier, deck);
        String w = "[";
        for (String winner : winners) {
            w += winner + ", ";
        }
        System.out.println("getWinners(..) -----> " + 
                w.substring(0,w.length()-2) + "]");
    }
    
    private static void case2(){
        Player P1 = new Player("Player 1"), 
           P2 = new Player("Player 2"), 
           P3 = new Player("Player 3"), 
           croupier = new Player("Croupier");
        ArrayList<Card> deck = new ArrayList<>();
        
        System.out.println("###Caso 2");
        Players init = new Players(P1, P2, P3, croupier, deck);
        init.initTest2();
        
        System.out.println(P1.toString() + "(" + BlackJack.getSumHand(P1.getHand()) + ")");
        System.out.println(P2.toString() + "(" +  BlackJack.getSumHand(P2.getHand()) + ")");
        System.out.println(P3.toString() + "(" +  BlackJack.getSumHand(P3.getHand()) + ")");
        System.out.println(croupier.toString() + "(" +  BlackJack.getSumHand(croupier.getHand()) + ")");

        System.out.println("Deck: " + deck.toString() + "\n");
        
        String[] winners = BlackJack.getWinners(P1, P2, P3, croupier, deck);
        String w = "[";
        for (String winner : winners) {
            w += winner + ", ";
        }
        System.out.println("getWinners(..) -----> " + 
                w.substring(0,w.length()-2) + "]");
    }
}
