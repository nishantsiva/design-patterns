package org.nishant.decoratorpattern.contiment;

import org.nishant.decoratorpattern.Beverage;

public class SteamedMilk implements CondimentDecorator
{
    private final Beverage beverage;


    public SteamedMilk(Beverage beverage)
    {
        this.beverage = beverage;
    }


    @Override
    public Beverage getBeverage()
    {
        return beverage;
    }


    @Override
    public String getCondimentDescription()
    {
        return "Steamed Milk";
    }


    @Override
    public double getCondimentCost()
    {
        return 0.10;
    }
}
