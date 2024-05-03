package org.nishant.singletonpattern.service;

/**
 * The Singleton Pattern ensures a class has only one
 * instance, and provides a global point of access to it.
 */
public class ChocolateBoiler
{
    private volatile static ChocolateBoiler uniqueInstance;

    private boolean empty;
    private boolean boiled;


    private ChocolateBoiler()
    {
        empty = true;
        boiled = false;
    }


    public static ChocolateBoiler getInstance()
    {
        if (uniqueInstance == null)
        {
            synchronized (ChocolateBoiler.class)
            {
                if (uniqueInstance == null)
                {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }

    public static ChocolateBoiler getInstanceNonSync()
    {
        if (uniqueInstance == null)
        {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }


    public void fill()
    {
        boolean beforeEmpty = empty;
        boolean beforeBoiled = boiled;
        if (isEmpty())
        {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
        display("FILL", beforeEmpty, beforeBoiled, empty, boiled);
    }


    public void drain()
    {
        boolean beforeEmpty = empty;
        boolean beforeBoiled = boiled;
        if (!isEmpty() && isBoiled())
        {
            // drain the boiled milk and chocolate
            empty = true;
        }
        display("DRAIN", beforeEmpty, beforeBoiled, empty, boiled);
    }


    public void boil()
    {
        boolean beforeEmpty = empty;
        boolean beforeBoiled = boiled;
        if (!isEmpty() && !isBoiled())
        {
            // bring the contents to a boil
            boiled = true;
        }
        display("BOIL", beforeEmpty, beforeBoiled, empty, boiled);
    }


    public boolean isEmpty()
    {
        return empty;
    }


    public boolean isBoiled()
    {
        return boiled;
    }


    private void display(String action, boolean beforeEmpty, boolean beforeBoiled, boolean empty, boolean boiled)
    {
        System.out.println(formatState(action) + ":: empty: " + formatState(beforeEmpty) + " -> " + formatState(empty) + ", boiled: " + formatState(beforeBoiled) + " -> " + formatState(
            boiled));
    }


    private <T> String formatState(T state)
    {
        return String.format("%-5s", state);
    }
}
