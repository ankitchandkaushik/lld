package patterns.behavorial.chainofresponsibility.spamService;

public class PhishingFilter implements IFilter{
    IFilter next;
    public PhishingFilter(IFilter next) {
        this.next= next;
    }

    public void setNext(IFilter next) {
        this.next = next;
    }

    @Override
    public void filter(Message m) {
        if(m.isPhishing()) {
            System.out.println("Filter phishing message : " + m.toString());
            return ;
        }

        if(next == null) {
            System.out.println("Message is safe : " + m.toString());
            return;
        }


        next.filter(m);

    }
}
