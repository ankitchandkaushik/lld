package patterns.behavorial.observer.notification.service;

import java.util.*;

public class NotificationService {
    List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    public void sendNotification(String message) {
        for(Observer o: observers) {
            o.update(message);
        }
    }
    
}
