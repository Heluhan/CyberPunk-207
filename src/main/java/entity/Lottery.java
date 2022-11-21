package entity;

import gateway.Cardsheap;

public class Lottery extends strategy_card{
    public void use(){
        Card c1 = Cardsheap.draw();
        Card c2 = Cardsheap.draw();
        getTarget().addCard(c1);
        getTarget().addCard(c2);
    }

    @Override
    public String toString() {
        return "Lottery";
    }
}
