package org.nishant.factorymethodpattern.pizza.impl;

import org.nishant.factorymethodpattern.pizza.Pizza;
import org.nishant.factorymethodpattern.pizza.ingrediantfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza
{
    PizzaIngredientFactory ingredientFactory;


    public ClamPizza(PizzaIngredientFactory ingredientFactory)
    {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    public void prepare()
    {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
