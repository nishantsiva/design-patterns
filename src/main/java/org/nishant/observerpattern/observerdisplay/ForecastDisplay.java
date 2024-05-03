package org.nishant.observerpattern.observerdisplay;

import org.nishant.observerpattern.observable.WeatherData;
import org.nishant.observerpattern.utils.Observer;

public class ForecastDisplay implements Observer<WeatherData>, DisplayElement
{
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;


    public ForecastDisplay(WeatherData weatherData)
    {
        registerToObservable(weatherData);
    }


    @Override
    public void notifyChange()
    {
        if (weatherData != null)
        {
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();

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
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure)
        {
            System.out.println("Improving weather on the way!");
        }
        else if (currentPressure == lastPressure)
        {
            System.out.println("More of the same");
        }
        else if (currentPressure < lastPressure)
        {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
