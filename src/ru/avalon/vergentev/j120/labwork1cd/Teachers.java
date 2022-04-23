package ru.avalon.vergentev.j120.labwork1cd;

public class Teachers<T1, T2, T3, T4> extends Persons<T1, T2, T3> {
    Consts DEGREE;
    private T4 specialization;

    //CONSTRUCTORS
    public Teachers(T1 surname, T2 name, Consts SEX, T3 faculty, Consts DEGREE, T4 specialization) {
        super(surname, name, SEX, faculty);
        this.DEGREE = DEGREE;
        setSpecialization(specialization);
    }

    //METHODS
    @Override
    public String toString() {
        return super.toString() + "teaches at " + " faculty. " +
                switch (SEX) {
                    case MALE -> "He has ";
                    case FEMALE -> "She has ";
                    default -> throw new IllegalStateException("Unexpected value: " + SEX);
                }
                +
                switch (DEGREE) {
                    case MSC -> "Master of science degree in " + getSpecialization() + ". ";
                    case PHD -> "PhD degree in " + getSpecialization() + ". ";
                    case DSC -> "Doctor of science degree  in " + getSpecialization() + ". ";
                    default -> throw new IllegalStateException("Unexpected value: " + DEGREE);
                }
                + '\n'
                ;
    }


    //GETTERS AND SETTERS
    public T4 getSpecialization() {
        return specialization;
    }

    public void setSpecialization(T4 specialization) {
        this.specialization = specialization;
    }
}

