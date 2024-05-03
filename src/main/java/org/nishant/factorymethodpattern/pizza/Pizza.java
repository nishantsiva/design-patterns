package org.nishant.factorymethodpattern.pizza;

import org.nishant.factorymethodpattern.pizza.incrediants.Cheese;
import org.nishant.factorymethodpattern.pizza.incrediants.Clams;
import org.nishant.factorymethodpattern.pizza.incrediants.Dough;
import org.nishant.factorymethodpattern.pizza.incrediants.Pepperoni;
import org.nishant.factorymethodpattern.pizza.incrediants.Sauce;
import org.nishant.factorymethodpattern.pizza.incrediants.Veggie;

public abstract class Pizza
{
    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggie[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;


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


    public String getName()
    {
        return name;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public String toString()
    {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        appendIngredient(dough, result);
        appendIngredient(sauce, result);
        appendIngredient(cheese, result);
        appendIngredient(getVeggiesBuilder(), result);
        appendIngredient(clam, result);
        appendIngredient(pepperoni, result);
        return result.toString();
    }


    private StringBuilder getVeggiesBuilder()
    {
        StringBuilder veggiesBuilder = null;
        if (veggies != null)
        {
            veggiesBuilder = new StringBuilder();
            for (int i = 0; i < veggies.length; i++)
            {
                veggiesBuilder.append(veggies[i]);
                if (i < veggies.length - 1)
                {
                    veggiesBuilder.append(", ");
                }
            }
        }
        return veggiesBuilder;
    }


    private <T> void appendIngredient(T ingredient, StringBuilder result)
    {
        if (ingredient != null)
        {
            result.append(ingredient);
            result.append("\n");
        }
    }
}
