package ru.avalon.vergentev.j120.labwork1;

public class PhoneNumbers {
    private int code;
    private int number;

    //Constructors
    //�� ������� 1 ����������� ������ ��������� ��� �����:
    public PhoneNumbers(int code, int number) {
        setCode(code);
        setNumber(number);
    }

    //Methods
    //�������������� ����� toString, ������� ����� �������� ���� ������ � ������ ��� ����
    @Override
    public String toString() {
        return "Phone number = +" + code/1000 + "-(" + code%1000 + ")" + number/10000 + "-" + (number%10000)/100 + "-" + number%100;
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
    public void setNumber(int number) {
        this.number = number;
    }


}
