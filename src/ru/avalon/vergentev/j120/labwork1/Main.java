package ru.avalon.vergentev.j120.labwork1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //����� ��������� HashSet (���������� Set) ��� �������� �������� PhoneNumber (������� 1)
        Set<PhoneNumbers> phoneNumbers = new HashSet<>();
            //������ ��� ������� ���� PhoneNumber
            PhoneNumbers phone1 = new PhoneNumbers(7962, 7051111);
            PhoneNumbers phone2 = new PhoneNumbers(7962, 7051112);
            //�������� � ���� ��������� ��� ������� ����� ���� PhoneNumber
            phoneNumbers.add(phone1);
            phoneNumbers.add(phone2);
        //������� � ������� ���� ������ �� ��������� HashSet
        System.out.println(phone1);
        System.out.println(phone2);



    }
}
