package org.nishant.simplefactory.pizza;

public class CheesePizza extends Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("Preparing Cheese Pizza...");
    }
}
