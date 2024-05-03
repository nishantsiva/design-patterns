package org.nishant.strategypattern.duck;

import org.nishant.strategypattern.behaviour.fly.FlyWithWings;
import org.nishant.strategypattern.behaviour.quack.Quack;

public class RedHeadDuck extends Duck
{
    public RedHeadDuck()
    {
        setQuackBehaviour(new Quack());
        setFlyBehavior(new FlyWithWings());
    }


    @Override
    public void display()
    {
        System.out.println("I’m a real RedHead duck");
    }
}
