package org.designPatterns.observer;

public interface Observer {
    public void registerSubject();
    public void unRegisterSubject();
    public void update(float temprature,float pressure,float humidity);

}
