package org.nishant.decoratorpattern.contiment;

import org.nishant.decoratorpattern.Beverage;

public class Mocha implements CondimentDecorator
{
    private final Beverage beverage;


    public Mocha(Beverage beverage)
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
        return "Mocha";
    }


    @Override
    public double getCondimentCost()
    {
        return 0.20;
    }
}
