package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcrectSubject implements Subject{
    private List<Observer> observers;
    private String message;

    public ConcrectSubject() {
        this.observers = new ArrayList<Observer>();
    }
    
    public void postMessage(String msg){
        System.out.println("Nova mensagem:" + msg);
        this.message = msg;
        notifyObservers();
    }

    @Override
    public void register(Observer obs) {
        if (!observers.contains(obs))
            observers.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
            observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer obs) {
        return this.message;    
    }    
}
