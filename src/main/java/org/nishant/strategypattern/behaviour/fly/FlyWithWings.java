package org.nishant.strategypattern.behaviour.fly;

public class FlyWithWings implements FlyBehaviour
{

    @Override
    public void fly()
    {
        System.out.println("I am flying...");
    }
}
