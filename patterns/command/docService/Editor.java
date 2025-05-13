package patterns.command.docService;

public class Editor {
    ICommand command;
    public Editor(ICommand command) {
        this.command = command;
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute('a');
    }

    public void pressUndo() {
        command.undo();
    }
}
