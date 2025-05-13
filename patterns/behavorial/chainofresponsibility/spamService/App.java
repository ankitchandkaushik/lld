package patterns.behavorial.chainofresponsibility.spamService;

public class App {
    public static void main(String[] args) {
        Message gm = new Message(false, false, false, false);
        Message vm = new Message(true, false, false, false);
        Message pm = new Message(false, true, false, false);
        Message cm = new Message(false, true, false, true);
        Message m5 = new Message(true, true, true, true);


        IFilter spamFilter = new VirusFilter(new PhishingFilter(new AdSpamFilter(new ContentSpamFilter(null))));

        spamFilter.filter(gm);
        spamFilter.filter(vm);
        spamFilter.filter(pm);
        spamFilter.filter(cm);
        spamFilter.filter(m5);
    }
}
