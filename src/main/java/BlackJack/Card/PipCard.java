package BlackJack.Card;

public class PipCard extends Card{

    public PipCard(int value) {
        super(value);
    }
    
    @Override
    public String toString() {
        return getValue() + "";
    }
    
    @Override
    public boolean equals(Object c){
        if(c instanceof PipCard){
            PipCard p = (PipCard) c;
            return(p.getValue() == getValue());
        }
        return false;
    }
    
}
