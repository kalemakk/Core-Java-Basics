package com.company.observer;

public class Main {
    public static void main(String[] args) {
        SimpleSubject subject = new SimpleSubject();
        SimpleObserver observer = new SimpleObserver(subject);
        SimpleObserver observer1 = new SimpleObserver(subject);
        observer.display();
        observer1.display();
        subject.setValue(200);


    }

}
