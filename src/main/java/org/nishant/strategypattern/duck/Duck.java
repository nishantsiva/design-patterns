package org.nishant.strategypattern.duck;

import org.nishant.strategypattern.behaviour.fly.FlyBehaviour;
import org.nishant.strategypattern.behaviour.quack.QuackBehaviour;

public abstract class Duck
{
    private FlyBehaviour flyBehavior;
    private QuackBehaviour quackBehaviour;


    public abstract void display();


    public void performFly()
    {
        flyBehavior.fly();
    }


    public void performQuack()
    {
        quackBehaviour.quack();
    }


    public void setFlyBehavior(FlyBehaviour flyBehavior)
    {
        this.flyBehavior = flyBehavior;
    }


    public void setQuackBehaviour(QuackBehaviour quackBehaviour)
    {
        this.quackBehaviour = quackBehaviour;
    }


    public void swim()
    {
        System.out.println("All ducks float, even decoys!");
    }
}
