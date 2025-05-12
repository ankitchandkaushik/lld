package patterns.behavorial.observer.notification.service;

public class PushNotification implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Notified using push");
    }
    
}
