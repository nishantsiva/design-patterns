package org.nishant.observerpattern.observerdisplay;

import org.nishant.observerpattern.observable.WeatherData;
import org.nishant.observerpattern.utils.Observer;

public class HeatIndexDisplay implements Observer<WeatherData>, DisplayElement
{
    float heatIndex = 0.0f;
    private WeatherData weatherData;


    public HeatIndexDisplay(WeatherData weatherData)
    {
        registerToObservable(weatherData);
    }


    @Override
    public void notifyChange()
    {
        if (weatherData != null)
        {
            heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
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
        System.out.println("Heat index is " + heatIndex);
    }


    private float computeHeatIndex(float t, float rh)
    {
        return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
            + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
            + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
            (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
            (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
            (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
            0.000000000843296 * (t * t * rh * rh * rh)) -
            (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }
}
