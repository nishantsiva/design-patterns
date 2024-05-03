package org.nishant.decoratorpattern.beverage;

import org.nishant.decoratorpattern.Beverage;

public class DarkRoast implements Beverage
{
    @Override
    public String getDescription()
    {
        return "Dark Roast";
    }


    @Override
    public double cost()
    {
        return 0.99;
    }
}
