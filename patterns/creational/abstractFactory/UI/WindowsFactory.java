package patterns.creational.abstractFactory.UI;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button buildButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox buildTextBox() {
        return new WindowsTextBox();
    
    }
    
}
