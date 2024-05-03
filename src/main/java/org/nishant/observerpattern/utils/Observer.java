package org.nishant.observerpattern.utils;

public interface Observer<T extends Observable<T>>
{
    void notifyChange();

    void registerToObservable(T observable);

    void removeFromObservable();
}
