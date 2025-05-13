package patterns.behavorial.command.docService;


public interface ICommand {
    public void execute(Character c) ;
    public void undo();
}
