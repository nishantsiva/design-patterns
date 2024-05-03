package org.nishant.strategypattern.duck;

import org.nishant.strategypattern.behaviour.fly.FlyNoWay;
import org.nishant.strategypattern.behaviour.quack.MuteQuack;

public class DecoyDuck extends Duck
{
    public DecoyDuck()
    {
        setQuackBehaviour(new MuteQuack());
        setFlyBehavior(new FlyNoWay());
    }


    @Override
    public void display()
    {
        System.out.println("I’m a Decoy duck");
    }
}
