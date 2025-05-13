package patterns.structural.decorator.pizza;

public abstract class PizzaDecorator implements IPizza{
    IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }




}
