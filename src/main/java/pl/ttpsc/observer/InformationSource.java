package pl.ttpsc.observer;

import java.util.LinkedList;
import java.util.List;

public class InformationSource {
    private List<Observer> observers;
    private String message;

    public InformationSource() {
        observers = new LinkedList<>();
    }


    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    public void subcribe(Observer observer) {
        observers.add(observer);
    }
    public void unsubcribe(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        observers.forEach( o -> o.update(message));
    }
}
