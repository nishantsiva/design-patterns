package org.nishant.decoratorpattern.contiment;

import org.nishant.decoratorpattern.Beverage;

public interface CondimentDecorator extends Beverage
{
    Beverage getBeverage();

    String getCondimentDescription();

    double getCondimentCost();

    @Override
    default String getDescription()
    {
        return getBeverage().getDescription() + ", " + getCondimentDescription();
    }

    @Override
    default double cost()
    {
        return getBeverage().cost() + getCondimentCost();
    }
}
