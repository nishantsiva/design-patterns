package org.nishant.simplefactory.pizza;

public abstract class Pizza
{
    abstract public void prepare();


    public void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }


    public void cut()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }


    public void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
