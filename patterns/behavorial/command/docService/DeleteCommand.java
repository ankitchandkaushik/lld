package patterns.behavorial.command.docService;


public class DeleteCommand implements ICommand{
    File file;
    public DeleteCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute(Character c)  {
        // TODO Auto-generated method stub
        file.deleteChar();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        file.addChar();
    }
    
}
