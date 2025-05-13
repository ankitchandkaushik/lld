package patterns.structural.decorator.pizza;

public class App {

    public static void main(String[] args) {
        IPizza pizza = new PlainPizza();
        pizza = new Cheese(pizza);
        pizza = new Sausage(pizza);
        System.out.println("DEscription: " + pizza.getDescription());
        System.out.println("Cost: " + pizza.getCost());
    }
    
}
