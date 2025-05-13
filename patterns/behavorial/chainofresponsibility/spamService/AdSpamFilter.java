package patterns.behavorial.chainofresponsibility.spamService;

public class AdSpamFilter  implements IFilter{
    IFilter next;
    public AdSpamFilter(IFilter next) {
        this.next= next;
    }

    public void setNext(IFilter next) {
        this.next = next;
    }

    @Override
    public void filter(Message m) {
        if(m.isPhishing()) {
            System.out.println("Filter ad-spam message : " + m.toString());
            return ;
        }

        if(next == null) {
            System.out.println("Message is safe : " + m.toString());
            return;
        }


        next.filter(m);

    }
}
