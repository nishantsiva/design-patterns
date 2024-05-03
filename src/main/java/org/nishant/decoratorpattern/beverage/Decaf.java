package org.nishant.decoratorpattern.beverage;

import org.nishant.decoratorpattern.Beverage;

public class Decaf implements Beverage
{
    @Override
    public String getDescription()
    {
        return "Decaf";
    }


    @Override
    public double cost()
    {
        return 1.05;
    }
}
