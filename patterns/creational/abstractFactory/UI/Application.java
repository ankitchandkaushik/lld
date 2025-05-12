package patterns.creational.abstractFactory.UI;

public class Application {
    Button button;
    TextBox textBox;
    public Application(Button button, TextBox textBox) {
        this.button = button;
        this.textBox = textBox;
    }

    public void buildApp() {
        button.render();
        textBox.render();
    }
}
