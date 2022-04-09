package ru.avalon.vergentev.j120.labwork1;

public class PhoneNumbers {
    private long number;

    //Constructors
    //�� ������� 1 ����������� ������ ��������� ��� �����:
    public PhoneNumbers(long number) {
        setNumber(number);
    }

    //Methods
    //�������������� ����� toString, ������� ����� �������� ���� ������ � ������ ��� ����
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
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
}
