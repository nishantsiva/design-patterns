package org.nishant.simplefactory.pizza;

public class ClamPizza extends Pizza
{
    @Override
    public void prepare()
    {
        System.out.println("Preparing Clam Pizza...");
    }
}
