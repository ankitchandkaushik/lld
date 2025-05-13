package patterns.behavorial.chainofresponsibility.spamService;



public class Message {
    boolean virus;
    boolean phishing;
    boolean adSpam;
    boolean contentSpam;
    public Message(boolean virus, boolean phishing, boolean adSpam, boolean contentSpam) {
        this.virus = virus;
        this.phishing = phishing;
        this.adSpam = adSpam;
        this.contentSpam = contentSpam;
    }
    public boolean isVirus() {
        return virus;
    }
    public boolean isPhishing() {
        return phishing;
    }
    public boolean isAdSpam() {
        return adSpam;
    }
    public boolean isContentSpam() {
        return contentSpam;
    }

    

    
}