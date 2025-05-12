package patterns.behavorial.observer.notification.service;

public class App {
    public static void main(String[] args) {
        Observer smObserver = new SMSNotification();
        Observer pushObserver = new PushNotification();

        NotificationService service = new NotificationService();
        service.subscribe(smObserver);
        service.subscribe(pushObserver);
        service.sendNotification("Hello");
        service.unsubscribe(pushObserver);
        service.sendNotification("World");
    }
}
