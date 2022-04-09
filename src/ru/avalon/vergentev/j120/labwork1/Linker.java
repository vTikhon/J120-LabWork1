package ru.avalon.vergentev.j120.labwork1;

public class Linker<T> {
    public Linker<T> next;
    public T data;


    //Constructors
    public Linker(T data) {
        this.data = data;
    }

    //Getters and Setters

}
