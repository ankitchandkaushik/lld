package patterns.creational.abstractFactory.UI;

public class Main {
    public static void main(String[] args) {
        // here you can use static class or interface/abstract like factory method as well 
        GUIFactory factory = new WindowsFactory();
        Application app = new Application(factory.buildButton(), factory.buildTextBox());
        app.buildApp();
    }
}
