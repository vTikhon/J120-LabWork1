package ru.avalon.vergentev.j120.labwork1;

public class PhoneNumbers {
    private int code;
    private long number;

    //Constructors
    //по заданию 1 конструктор должен принимать два числа:
    public PhoneNumbers(long number) {
//        setCode(code);
        setNumber(number);
    }

    //Methods
    //переопределяем метод toString, который будет выводить наши данные в нужном нам виде
    @Override
    public String toString() {
        return "Phone number: +"
                + number/10000000000L
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

    //Getters and Setters
    public long getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
}
