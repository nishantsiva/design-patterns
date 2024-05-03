package org.nishant.decoratorpattern.contiment;

import org.nishant.decoratorpattern.Beverage;

public class Soy implements CondimentDecorator
{
    private final Beverage beverage;


    public Soy(Beverage beverage)
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
        return "Soy";
    }


    @Override
    public double getCondimentCost()
    {
        return 0.15;
    }
}
