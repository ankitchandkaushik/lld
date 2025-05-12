package patterns.creational.abstractFactory.UI;

public class MacFactory implements GUIFactory{

    @Override
    public Button buildButton() {
        return new MacButton();
    }

    @Override
    public TextBox buildTextBox() {
        return new MacTextBox();
    }
    
}
