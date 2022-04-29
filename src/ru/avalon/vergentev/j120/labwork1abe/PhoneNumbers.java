package ru.avalon.vergentev.j120.labwork1abe;
import java.util.*;


public class PhoneNumbers {
    private long number;

    //Constructors
    public PhoneNumbers(long number) {
        setNumber(number);
    }

    //Methods
    @Override
    public String toString() {
        return "+" + number/10000000000L
                + "-("
                + (number%10000000000L)/1000000000
                + (number%1000000000)/100000000
                + (number%100000000)/10000000
                + ")"
                + (number%10000000)/1000000
                + (number%1000000)/100000
                + (number%100000)/10000
                + "-"
                + (number%10000)/1000
                + (number%1000)/100
                + "-"
                + (number%100)/10
                + number%10;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumbers that = (PhoneNumbers) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    //Getters and Setters
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
}
