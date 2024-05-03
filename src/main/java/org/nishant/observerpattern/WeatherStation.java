package org.nishant.observerpattern;

import org.nishant.observerpattern.observable.WeatherData;
import org.nishant.observerpattern.observerdisplay.CurrentConditionsDisplay;
import org.nishant.observerpattern.observerdisplay.ForecastDisplay;
import org.nishant.observerpattern.observerdisplay.HeatIndexDisplay;
import org.nishant.observerpattern.observerdisplay.StatisticsDisplay;

/**
 * The Observer Pattern defines a one-to-many
 * dependency between objects so that when one
 * object changes state, all of its dependents are
 * notified and updated automatically.
 */
public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);

        heatIndexDisplay.removeFromObservable();
        System.out.println();
        weatherData.setMeasurements(76, 85, 25.2f);
    }
}
