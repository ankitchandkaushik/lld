package patterns.creational.factory.Logger;

public class LoggerFactoryStatic {
    public static ILogger getLogger(String type) {
        if("console".equals(type)) {
            return new ConsoleLogger();
        } else if("file".equals(type)) {
            return new FileLogger();
        } else {
            throw new IllegalArgumentException(type + " not supported");
        }
    }
}
