package org.nishant.observerpattern.observable;

import java.util.ArrayList;
import org.nishant.observerpattern.utils.Observable;
import org.nishant.observerpattern.utils.Observer;

public class WeatherData implements Observable<WeatherData>
{
    private final ArrayList<Observer<WeatherData>> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;


    public void measurementsChanged()
    {
        notifyObservers();
    }


    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


    public float getTemperature()
    {
        return temperature;
    }


    public float getHumidity()
    {
        return humidity;
    }


    public float getPressure()
    {
        return pressure;
    }


    @Override
    public ArrayList<Observer<WeatherData>> getObservers()
    {
        return observers;
    }
}
