package patterns.structural.decorator.pizza;

public class Cheese extends PizzaDecorator{

    public Cheese(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
       return super.getCost() + 50;
    }
    
}
