package org.nishant.observerpattern.utils;

import java.util.ArrayList;

public interface Observable<T extends Observable<T>>
{
    default void registerObserver(Observer<T> o)
    {
        getObservers().add(o);
    }

    default void removeObserver(Observer<T> o)
    {
        getObservers().remove(o);
    }

    default void notifyObservers()
    {
        for (Observer<T> observer : getObservers())
        {
            observer.notifyChange();
        }
    }

    ArrayList<Observer<T>> getObservers();
}
