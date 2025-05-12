package patterns.creational.factory.Logger;

public class ConsoleFactory implements ILoggerFactory{

    @Override
    public ILogger createLogger() {
        return new ConsoleLogger();
    }
    
}
