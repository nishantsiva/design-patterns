package org.nishant.strategypattern.behaviour.quack;

public class MuteQuack implements QuackBehaviour
{
    @Override
    public void quack()
    {
        System.out.println("I can't quack!");
    }
}
