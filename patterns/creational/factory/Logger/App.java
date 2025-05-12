package patterns.creational.factory.Logger;

public class App {

    public static void main(String[] args) {
        ILogger consoleLogger = LoggerFactory.getLogger("console");
        ILogger fileLogger = LoggerFactory.getLogger("file");
        consoleLogger.log("Hello");
        fileLogger.log("Hello");
        ILogger dbLogger = LoggerFactory.getLogger("db");
    }
    
    
}
