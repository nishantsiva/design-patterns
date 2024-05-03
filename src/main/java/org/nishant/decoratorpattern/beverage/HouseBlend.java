package org.nishant.decoratorpattern.beverage;

import org.nishant.decoratorpattern.Beverage;

public class HouseBlend implements Beverage
{
    @Override
    public String getDescription()
    {
        return "House Blend";
    }


    @Override
    public double cost()
    {
        return 0.89;
    }
}
