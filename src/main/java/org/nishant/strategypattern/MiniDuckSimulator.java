package org.nishant.strategypattern;

import org.nishant.strategypattern.behaviour.fly.FlyRocketPowered;
import org.nishant.strategypattern.duck.DecoyDuck;
import org.nishant.strategypattern.duck.Duck;
import org.nishant.strategypattern.duck.MallardDuck;
import org.nishant.strategypattern.duck.ModelDuck;
import org.nishant.strategypattern.duck.RedHeadDuck;
import org.nishant.strategypattern.duck.RubberDuck;

/**
 * The Strategy Pattern defines a family of algorithms,
 * encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from
 * clients that use it.
 */
public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
        operate(new MallardDuck());
        operate(new RedHeadDuck());
        operate(new RubberDuck());
        operate(new DecoyDuck());

        Duck modelDuck = new ModelDuck();
        System.out.println("Default model duck:");
        operate(modelDuck);

        System.out.println("Model duck enhanced:");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        operate(modelDuck);
    }


    private static void operate(Duck duck)
    {
        duck.display();
        duck.swim();
        duck.performQuack();
        duck.performFly();
        System.out.println();
    }
}
