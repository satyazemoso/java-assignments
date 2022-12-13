package org.designPatterns.observer;

public class Main {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatasticsDisplay statasticsDisplay = new StatasticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        currentConditionsDisplay.registerSubject();
        statasticsDisplay.registerSubject();
        forecastDisplay.registerSubject();
        weatherData.setValues(11.11f,22.22f,33.33f);
        weatherData.measurementsChanged();

    }
}
