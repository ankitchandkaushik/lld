package patterns.structural.decorator.pizza;

public class PlainPizza implements IPizza{

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
       return 250;
    }
    
}
