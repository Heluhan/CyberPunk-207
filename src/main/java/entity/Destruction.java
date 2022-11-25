package entity;

public class Destruction extends strategy_card{
    @Override
    public boolean needTarget() {
        return true;
    }

    @Override
    public void use() {
        if (getTarget().getPocketcards().size() > 0) {
            getTarget().loosCard(0);
        }
    }

    @Override
    public String toString() {
        return "Destruction";
    }
}
