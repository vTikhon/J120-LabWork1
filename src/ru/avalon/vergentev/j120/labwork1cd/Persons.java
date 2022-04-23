package ru.avalon.vergentev.j120.labwork1cd;

public class Persons<T1, T2, T3> {
    private T1 surname;
    private T2 name;
    private T3 faculty;
    Consts SEX;

    //CONSTRUCTORS
    public Persons(T1 surname, T2 name, Consts SEX, T3 faculty) {
        setSurname(surname);
        setName(name);
        this.SEX = SEX;
        setFaculty(faculty);
    }

    //METHODS
    @Override
    public String toString() {
        return "This is " + surname + " " + name + ". "
                +
                switch (SEX) {
                    case MALE -> "He ";
                    case FEMALE -> "She ";
                    default -> throw new IllegalStateException("Unexpected value: " + SEX);
                }
                ;
    }


    //GETTERS AND SETTERS
    public T1 getSurname() {
        return surname;
    }

    public void setSurname(T1 surname) {
        this.surname = surname;
    }

    public T2 getName() {
        return name;
    }

    public void setName(T2 name) {
        this.name = name;
    }

    public T3 getFaculty() {
        return faculty;
    }

    public void setFaculty(T3 faculty) {
        this.faculty = faculty;
    }



}
