package org.nishant.factorymethodpattern.pizzastore;

import org.nishant.factorymethodpattern.pizza.Pizza;

public abstract class PizzaStore
{
    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }


    /**
     * Factory Method
     * <p>
     * The Factory Method Pattern defines an interface
     * for creating an object, but lets subclasses decide which
     * class to instantiate. Factory Method lets a class defer
     * instantiation to subclasses.
     * <p>
     * Use Factory Method to
     * decouple our client code from the concrete classes we
     * need to instantiate, or if we don’t know ahead of time
     * all the concrete classes we are going to need. To use Factory Method,
     * just subclass it and implement its factory method!
     */
    protected abstract Pizza createPizza(String type);
}
