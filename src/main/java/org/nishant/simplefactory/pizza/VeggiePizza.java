package org.nishant.simplefactory.pizza;

public class VeggiePizza extends Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("Preparing Veggie Pizza...");
    }
}
