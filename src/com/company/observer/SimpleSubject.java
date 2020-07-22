package com.company.observer;
import java.util.ArrayList;
public class SimpleSubject implements Subject {
    private ArrayList<Observer> observers;
    private int value;
    SimpleSubject(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0) {
            observers.remove(i);
        }
    }
    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update(value);
        }
    }
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
