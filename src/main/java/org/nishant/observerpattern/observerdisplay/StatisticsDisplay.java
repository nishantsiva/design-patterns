package org.nishant.observerpattern.observerdisplay;

import org.nishant.observerpattern.observable.WeatherData;
import org.nishant.observerpattern.utils.Observer;

public class StatisticsDisplay implements Observer<WeatherData>, DisplayElement
{
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;


    public StatisticsDisplay(WeatherData weatherData)
    {
        registerToObservable(weatherData);
    }


    @Override
    public void notifyChange()
    {
        if (weatherData != null)
        {
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp)
            {
                maxTemp = temp;
            }

            if (temp < minTemp)
            {
                minTemp = temp;
            }

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
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
            + "/" + maxTemp + "/" + minTemp);
    }
}
