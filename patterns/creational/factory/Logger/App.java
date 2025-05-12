package patterns.creational.factory.Logger;

public class App {

    public static void main(String[] args) {
        ILogger consoleLogger = LoggerFactoryStatic.getLogger("console");
        ILogger fileLogger = LoggerFactoryStatic.getLogger("file");
        consoleLogger.log("Hello");
        fileLogger.log("Hello");
        // ILogger dbLogger = LoggerFactoryStatic.getLogger("db");






        // =====================================================
        // using abstract creator
        ConsoleFactory cf = new ConsoleFactory();
        ILogger cLogger = cf.createLogger();
        cLogger.log("Hello abstract");
    }
    
    
}
