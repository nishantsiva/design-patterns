package org.nishant.strategypattern.duck;

import org.nishant.strategypattern.behaviour.fly.FlyNoWay;
import org.nishant.strategypattern.behaviour.quack.Squeak;

public class RubberDuck extends Duck
{
    public RubberDuck()
    {
        setQuackBehaviour(new Squeak());
        setFlyBehavior(new FlyNoWay());
    }


    @Override
    public void display()
    {
        System.out.println("I’m a Rubber duck");
    }
}
