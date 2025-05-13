package patterns.behavorial.chainofresponsibility.spamService;

public class VirusFilter implements IFilter{

    IFilter next;
    public VirusFilter(IFilter next) {
        this.next= next;
    }

    public void setNext(IFilter next) {
        this.next = next;
    }

    @Override
    public void filter(Message m) {
        if(m.isVirus()) {
            System.out.println("Filter virus message : " + m.toString());
            return ;
        }

        if(next == null) {
            System.out.println("Message is safe : " + m.toString());
            return;
        }


        next.filter(m);

    }
    
}
