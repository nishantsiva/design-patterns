package org.nishant.factorymethodpattern.pizzastore;

import org.nishant.factorymethodpattern.pizza.Pizza;
import org.nishant.factorymethodpattern.pizza.impl.CheesePizza;
import org.nishant.factorymethodpattern.pizza.impl.ClamPizza;
import org.nishant.factorymethodpattern.pizza.impl.PepperoniPizza;
import org.nishant.factorymethodpattern.pizza.impl.VeggiePizza;
import org.nishant.factorymethodpattern.pizza.ingrediantfactory.ChicagoPizzaIngredientFactory;
import org.nishant.factorymethodpattern.pizza.ingrediantfactory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore
{
    protected Pizza createPizza(String item)
    {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (item)
        {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
