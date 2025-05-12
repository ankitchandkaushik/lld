package patterns.decorator.pizza;

public class Sausage extends PizzaDecorator{
    
    public Sausage(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sausage";
    }

    @Override
    public double getCost() {
       return super.getCost() + 100;
    }
}
