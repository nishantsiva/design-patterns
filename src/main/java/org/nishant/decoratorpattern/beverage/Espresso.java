package org.nishant.decoratorpattern.beverage;

import org.nishant.decoratorpattern.Beverage;

public class Espresso implements Beverage
{
    @Override
    public String getDescription()
    {
        return "Espresso";
    }


    @Override
    public double cost()
    {
        return 1.99;
    }
}
