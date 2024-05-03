package org.nishant.factorymethodpattern.pizza.ingrediantfactory;

import org.nishant.factorymethodpattern.pizza.incrediants.Cheese;
import org.nishant.factorymethodpattern.pizza.incrediants.Clams;
import org.nishant.factorymethodpattern.pizza.incrediants.Dough;
import org.nishant.factorymethodpattern.pizza.incrediants.FreshClams;
import org.nishant.factorymethodpattern.pizza.incrediants.Garlic;
import org.nishant.factorymethodpattern.pizza.incrediants.MarinaraSauce;
import org.nishant.factorymethodpattern.pizza.incrediants.Mushroom;
import org.nishant.factorymethodpattern.pizza.incrediants.Onion;
import org.nishant.factorymethodpattern.pizza.incrediants.Pepperoni;
import org.nishant.factorymethodpattern.pizza.incrediants.RedPepper;
import org.nishant.factorymethodpattern.pizza.incrediants.ReggianoCheese;
import org.nishant.factorymethodpattern.pizza.incrediants.Sauce;
import org.nishant.factorymethodpattern.pizza.incrediants.SlicedPepperoni;
import org.nishant.factorymethodpattern.pizza.incrediants.ThinCrustDough;
import org.nishant.factorymethodpattern.pizza.incrediants.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return new ThinCrustDough();
    }


    @Override
    public Sauce createSauce()
    {
        return new MarinaraSauce();
    }


    @Override
    public Cheese createCheese()
    {
        return new ReggianoCheese();
    }


    @Override
    public Veggie[] createVeggies()
    {
        return new Veggie[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }


    @Override
    public Pepperoni createPepperoni()
    {
        return new SlicedPepperoni();
    }


    @Override
    public Clams createClam()
    {
        return new FreshClams();
    }
}
