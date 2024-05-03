package org.nishant.decoratorpattern;

import org.nishant.decoratorpattern.beverage.DarkRoast;
import org.nishant.decoratorpattern.beverage.Espresso;
import org.nishant.decoratorpattern.beverage.HouseBlend;
import org.nishant.decoratorpattern.contiment.Mocha;
import org.nishant.decoratorpattern.contiment.Soy;
import org.nishant.decoratorpattern.contiment.Whip;

/**
 * The Decorator Pattern attaches additional
 * responsibilities to an object dynamically.
 * Decorators provide a fl exible alternative to
 * subclassing for extending functionality
 */
public class StarBuzzCoffee
{
    public static void main(String[] args)
    {
        Beverage beverage = new Espresso();
        display(beverage);

        Beverage beverage2 = new Whip(new Mocha(new Mocha(new DarkRoast())));
        display(beverage2);

        Beverage beverage3 = new Whip(new Mocha(new Soy(new HouseBlend())));
        display(beverage3);
    }


    private static void display(Beverage beverage)
    {
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
