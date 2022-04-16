package ru.avalon.vergentev.j120.labwork1;

public class Linker<T> {
    public Linker<T> next;
    public Linker<T> prev;
    public T data;

    //CONSTRUCTORS
    public Linker(T data) {
        this.data = data;
    }

    //METHODS
    @Override
    public String toString() {
        return "" + data;
    }
}
