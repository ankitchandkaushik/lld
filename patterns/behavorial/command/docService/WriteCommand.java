package patterns.behavorial.command.docService;



public class WriteCommand implements ICommand{
    File file;

    public WriteCommand(File file) {
        this.file = file;
    }

    @Override
    public void execute(Character c)   {
        file.addChar();
    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub
        // write complete code when time permits
        file.deleteChar();
    }
    
}
