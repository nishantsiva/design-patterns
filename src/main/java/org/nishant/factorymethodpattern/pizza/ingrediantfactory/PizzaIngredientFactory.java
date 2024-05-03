package org.nishant.factorymethodpattern.pizza.ingrediantfactory;

import org.nishant.factorymethodpattern.pizza.incrediants.Cheese;
import org.nishant.factorymethodpattern.pizza.incrediants.Clams;
import org.nishant.factorymethodpattern.pizza.incrediants.Dough;
import org.nishant.factorymethodpattern.pizza.incrediants.Pepperoni;
import org.nishant.factorymethodpattern.pizza.incrediants.Sauce;
import org.nishant.factorymethodpattern.pizza.incrediants.Veggie;

/**
 * Abstract factory
 * <p>
 * The Abstract Factory Pattern provides an interface
 * for creating families of related or dependent objects
 * without specifying their concrete classes.
 * <p>
 * Use this whenever we have families of
 * products we need to create, and we want to make sure
 * our clients create products that belong together.
 */
public interface PizzaIngredientFactory
{
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggie[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
