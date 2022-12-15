package org.designPatterns.observer;

public class StatasticsDisplay implements Display,Observer{
    Subject subject;
    public StatasticsDisplay(Subject subject){
        this.subject = subject;
    }
    @Override
    public void display(float temperature, float pressure, float humidity) {
        System.out.println("StatasticsDisplay");
        System.out.println("*********************************");
        System.out.println("temperature:"+temperature);
        System.out.println("pressure"+pressure);
        System.out.println("humidity:"+humidity);
        System.out.println("*********************************");

    }

    @Override
    public void registerSubject() {
        subject.addObserver(this);
    }

    @Override
    public void unRegisterSubject() {
        subject.removeObserver(this);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        display(temperature,pressure,humidity);
    }
}
