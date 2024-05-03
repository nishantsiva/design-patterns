package org.nishant.simplefactory;

import org.nishant.simplefactory.pizza.CheesePizza;
import org.nishant.simplefactory.pizza.ClamPizza;
import org.nishant.simplefactory.pizza.PepperoniPizza;
import org.nishant.simplefactory.pizza.Pizza;
import org.nishant.simplefactory.pizza.VeggiePizza;

public class SimplePizzaFactory
{
    public Pizza createPizza(String type)
    {
        Pizza pizza;
        switch (type)
        {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("Unknown pizza type: " + type);
        }
        return pizza;
    }
}
