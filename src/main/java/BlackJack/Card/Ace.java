package BlackJack.Card;
public class Ace extends Card {
    private int otherValue = 1;

    public Ace() {
        super(11);
    }
    public int getOtherValue(){
        return this.otherValue;
    }
    
    @Override
    public String toString() {
        return "A";
    }
    
    public String toFullString() {
        return "Ace";
    }
    
    @Override
    public boolean equals(Object c){
        return(c instanceof Ace);
    }
    
    
    
}
