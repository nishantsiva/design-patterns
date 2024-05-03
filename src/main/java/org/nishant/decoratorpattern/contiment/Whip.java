package org.nishant.decoratorpattern.contiment;

import org.nishant.decoratorpattern.Beverage;

public class Whip implements CondimentDecorator
{
    private final Beverage beverage;


    public Whip(Beverage beverage)
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
        return "Whip";
    }


    @Override
    public double getCondimentCost()
    {
        return 0.10;
    }
}
