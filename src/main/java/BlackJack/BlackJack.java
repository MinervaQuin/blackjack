
package BlackJack;

import BlackJack.Card.Ace;
import BlackJack.Card.Card;
import BlackJack.Player.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackJack {

    private static int BlackJack = 21;
    private static int MaxCroupier = 17;
    
    public static String[] getWinners(Player player1, Player player2, Player player3, Player croupier, List<Card> deck){
        
        List<Player> players = Arrays.asList(player1, player2, player3);
        
        List<Player> winners = new ArrayList<>();
        
        fillCroupierHand(croupier, deck);
        for(Player player:players){
            List<Card> CroupierHand = croupier.getHand();
            List<Card> PlayerHand = player.getHand();
            
            if(isBlackJack(CroupierHand)) {
                return new String[]{"Croupier"};
            } else if(isWinner(CroupierHand, PlayerHand)){
                winners.add(player);
            
            }
        }
        
        String[] winnerName = new String[winners.size()];
        for (int i = 0; i < winnerName.length; i++) {
            winnerName[i] = winners.get(i).getName();
            
        }
        return winnerName;
    }
    
    
    private static boolean isWinner(List<Card> CroupierHand, List<Card> PlayerHand){
        if(isBlackJack(PlayerHand)){return true;}
        if(getSumHand(PlayerHand) <= BlackJack){
            if((getSumHand(CroupierHand) > 21) || (getSumHand(CroupierHand) < getSumHand(PlayerHand))){
                return true;
            }       
        }
        return false;
    }

    public static boolean isBlackJack(List<Card> hand) {
        if((getSumHand(hand) != BlackJack) || (hand.size() != 2)){
            return false;
        }
        if(hand.get(0).getValue() == 10){
            return (hand.get(1).getValue() == 11);
        }else{
            return(hand.get(1).getValue() == 10); //No deberia ser falso?
        }
    }

    public static int getSumHand(List<Card> hand) {
        int sum = 0, aces = 0;

        for (Card card : hand) { 
            sum += card.getValue(); 
            if(card instanceof Ace){aces++;}
        }
        
        if(aces != 0){
                while(sum>21){ sum -= 10; }
            }
        return sum;
    }
    
     public static void fillCroupierHand(Player croupier, List<Card> deck) {
        List<Card> hand = croupier.getHand();
        int sum = getSumHand(hand);
        for(int i = 0; sum < MaxCroupier; i++){
            Card card= deck.get(i);
            croupier.addCard(card);
            hand = croupier.getHand();
            sum=getSumHand(hand);
        }
    }
}
