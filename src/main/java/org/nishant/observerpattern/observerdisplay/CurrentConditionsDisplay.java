package org.nishant.observerpattern.observerdisplay;

import org.nishant.observerpattern.observable.WeatherData;
import org.nishant.observerpattern.utils.Observer;

public class CurrentConditionsDisplay implements Observer<WeatherData>, DisplayElement
{
    private WeatherData weatherData;
    private float temperature;
    private float humidity;


    public CurrentConditionsDisplay(WeatherData weatherData)
    {
        registerToObservable(weatherData);
    }


    @Override
    public void notifyChange()
    {
        if (weatherData != null)
        {
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }


    @Override
    public void registerToObservable(WeatherData observable)
    {
        this.weatherData = observable;
        weatherData.registerObserver(this);
    }


    @Override
    public void removeFromObservable()
    {
        if (weatherData != null)
        {
            weatherData.removeObserver(this);
            weatherData = null;
        }
    }


    @Override
    public void display()
    {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
