package patterns.command.docService;


public interface ICommand {
    public void execute(Character c) ;
    public void undo();
}
