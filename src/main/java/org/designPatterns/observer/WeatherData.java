package org.designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    float temperature;
    float pressure;
    float humidity;
    List<Observer> observers = new ArrayList<>();
    public void setValues(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(){
        for(Observer observer:observers){
            observer.update(temperature,pressure,humidity);
        }
    }

    @Override
    public void measurementsChanged() {
        notifyObservers();

    }
}
