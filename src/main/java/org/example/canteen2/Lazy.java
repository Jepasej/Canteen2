package org.example.canteen2;

/**
 *  A helper class that delays the creation of an object of type T
 *  until it is actually needed by the user. The object is created only once and then reused.
 * @param <T> The type of object this class creates and returns - scenes in our case.
 */
public class Lazy<T> {
    private T value = null;
    private ConstWrapper<T> wrapperFunc;

    public Lazy(ConstWrapper<T> wrapperFunc) {
        this.wrapperFunc = wrapperFunc;
    }

    public T getValue() {
        return value = value==null?wrapperFunc.getInstance():value;
    }
}
