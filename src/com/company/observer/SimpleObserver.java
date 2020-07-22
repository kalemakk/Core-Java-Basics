package com.company.observer;

public class SimpleObserver implements Observer {
    private int value;
    SimpleSubject subject;
    SimpleObserver(SimpleSubject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }
    void removeObserver(){
        subject.registerObserver(this);
    }
    @Override
    public void update(int value) {
        this.value =value;
        display();
    }
    void display(){
        System.out.println("Value is : "+value);
    }
}
