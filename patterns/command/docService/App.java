package patterns.command.docService;

public class App {
    public static void main(String[] args) {
        File file = new File();
        ICommand writeCommand = new WriteCommand(file);
        ICommand deleteCommand = new DeleteCommand(file);

        Editor editor = new Editor(deleteCommand);
        editor.pressButton();
        editor.pressUndo();

        editor.setCommand(writeCommand);
        editor.pressButton();
        editor.pressUndo();
    }
}
