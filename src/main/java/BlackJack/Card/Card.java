package BlackJack.Card;


public abstract class Card {
    private int value;
    
    public Card(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    
    public abstract String toString();
    
    public abstract boolean equals(Object c);
    
}
