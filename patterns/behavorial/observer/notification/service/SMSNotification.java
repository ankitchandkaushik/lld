package patterns.behavorial.observer.notification.service;

public class SMSNotification implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Notify using sms");
    }
    
}
