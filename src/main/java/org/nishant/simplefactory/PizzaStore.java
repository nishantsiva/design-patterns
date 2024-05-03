package org.nishant.simplefactory;

import org.nishant.simplefactory.pizza.Pizza;

public class PizzaStore
{
    SimplePizzaFactory pizzaFactory;


    public PizzaStore(SimplePizzaFactory pizzaFactory)
    {
        this.pizzaFactory = pizzaFactory;
    }


    public static void main(String[] args)
    {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());

        store.orderPizza("cheese");
        store.orderPizza("clam");
    }


    public Pizza orderPizza(String pizzaType)
    {
        Pizza pizza = pizzaFactory.createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
