package patterns.creational.abstractFactory.UI;

public class WindowsTextBox implements TextBox{

    @Override
    public void render() {
        System.out.println("Rendering windows text box");
    }
    
}
