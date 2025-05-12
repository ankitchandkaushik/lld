package patterns.creational.factory.Logger;

public class FileFactory implements ILoggerFactory{

    @Override
    public ILogger createLogger() {
       return new FileLogger();
    }
    
}
