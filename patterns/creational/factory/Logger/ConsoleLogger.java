package patterns.creational.factory.Logger;

public class ConsoleLogger implements ILogger{

    @Override
    public void log(String message) {
        System.out.println("Console log: " + message);
    }
    
}
