package org.nishant.strategypattern.duck;

import org.nishant.strategypattern.behaviour.fly.FlyNoWay;
import org.nishant.strategypattern.behaviour.quack.MuteQuack;

public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        setQuackBehaviour(new MuteQuack());
        setFlyBehavior(new FlyNoWay());
    }


    @Override
    public void display()
    {
        System.out.println("I am a model duck");
    }
}
