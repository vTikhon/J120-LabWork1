package ru.avalon.vergentev.j120.labwork1cd;

public class Postgraduates<T1, T2, T3, T5> extends Persons<T1, T2, T3> {
    private T5 dissertationTitle;

    //CONSTRUCTORS
    public Postgraduates(T1 surname, T2 name, Consts SEX, T3 faculty, T5 dissertationTitle) {
        super(surname, name, SEX, faculty);
        setDissertationTitle(dissertationTitle);
    }

    //METHODS
    @Override
    public String toString() {
        return super.toString() + "studies at " + " faculty. " +
                switch (SEX) {
                    case MALE -> "His ";
                    case FEMALE -> "Her ";
                    default -> throw new IllegalStateException("Unexpected value: " + SEX);
                }
                + "thesis title is " + getDissertationTitle() + ". " + '\n'
                ;
    }

    //GETTERS AND SETTERS
    public T5 getDissertationTitle() {
        return dissertationTitle;
    }

    public void setDissertationTitle(T5 dissertationTitle) {
        this.dissertationTitle = dissertationTitle;
    }
}
