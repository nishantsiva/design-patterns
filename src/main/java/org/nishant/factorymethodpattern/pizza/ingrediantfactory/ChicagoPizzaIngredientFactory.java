package org.nishant.factorymethodpattern.pizza.ingrediantfactory;

import org.nishant.factorymethodpattern.pizza.incrediants.BlackOlives;
import org.nishant.factorymethodpattern.pizza.incrediants.Cheese;
import org.nishant.factorymethodpattern.pizza.incrediants.Clams;
import org.nishant.factorymethodpattern.pizza.incrediants.Dough;
import org.nishant.factorymethodpattern.pizza.incrediants.Eggplant;
import org.nishant.factorymethodpattern.pizza.incrediants.FrozenClams;
import org.nishant.factorymethodpattern.pizza.incrediants.MozzarellaCheese;
import org.nishant.factorymethodpattern.pizza.incrediants.Pepperoni;
import org.nishant.factorymethodpattern.pizza.incrediants.PlumTomatoSauce;
import org.nishant.factorymethodpattern.pizza.incrediants.Sauce;
import org.nishant.factorymethodpattern.pizza.incrediants.SlicedPepperoni;
import org.nishant.factorymethodpattern.pizza.incrediants.Spinach;
import org.nishant.factorymethodpattern.pizza.incrediants.ThickCrustDough;
import org.nishant.factorymethodpattern.pizza.incrediants.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory
{
    @Override
    public Dough createDough()
    {
        return new ThickCrustDough();
    }


    @Override
    public Sauce createSauce()
    {
        return new PlumTomatoSauce();
    }


    @Override
    public Cheese createCheese()
    {
        return new MozzarellaCheese();
    }


    @Override
    public Veggie[] createVeggies()
    {
        return new Veggie[] {new BlackOlives(), new Spinach(), new Eggplant()};
    }


    @Override
    public Pepperoni createPepperoni()
    {
        return new SlicedPepperoni();
    }


    @Override
    public Clams createClam()
    {
        return new FrozenClams();
    }
}
