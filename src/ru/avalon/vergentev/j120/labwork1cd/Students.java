package ru.avalon.vergentev.j120.labwork1cd;

public class Students<T1, T2, T3, T6> extends Persons<T1, T2, T3> {
    Consts LEVEL;
    private T6 courseNumber;

    //CONSTRUCTORS
    public Students(T1 surname, T2 name, Consts SEX, T3 faculty, Consts LEVEL, T6 courseNumber) {
        super(surname, name, SEX, faculty);
        this.LEVEL = LEVEL;
        setCourseNumber(courseNumber);
    }


    //METHODS
    @Override
    public String toString() {
        return super.toString() + "studies at " + getFaculty() + " faculty. " +
                switch (SEX) {
                    case MALE -> "He is ";
                    case FEMALE -> "She is ";
                    default -> throw new IllegalStateException("Unexpected value: " + SEX);
                } + " year " +
                switch (LEVEL) {
                    case BACHELOR -> Consts.BACHELOR + "'s student. ";
                    case MASTER -> Consts.MASTER + "student. ";
                    default -> throw new IllegalStateException("Unexpected value: " + LEVEL);
                }
                + '\n'
                ;
    }

    //GETTERS AND SETTERS
    public T6 getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(T6 courseNumber) {
        if ((int)courseNumber < 1){
            throw new IllegalArgumentException("Number of course can't less than one");
        }
        this.courseNumber = courseNumber;
    }

}
