package ru.avalon.vergentev.j120.labwork1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //����� ��������� HashSet (���������� Set) ��� �������� �������� PhoneNumber (������� 1)
        Set<PhoneNumbers> phoneNumbersSet = new HashSet<>();
        //����� ��������� HashMap (���������� Map) ��� �������� �������� PhoneNumber (������� 1)
        Map<PhoneNumbers, PhoneNumbers> phoneNumbersMap = new HashMap<>();
            //������ ������ ������� ���� PhoneNumber
            PhoneNumbers phone1 = new PhoneNumbers(7962, 7050000);
            PhoneNumbers phone2 = new PhoneNumbers(7962, 7050001);
            PhoneNumbers phone3 = new PhoneNumbers(7962, 7050002);
            PhoneNumbers phone4 = new PhoneNumbers(7962, 7050003);
            //�������� � ���� ��������� ��� ������� � Set
            phoneNumbersSet.add(phone1);
            phoneNumbersSet.add(phone2);
        //�������� ��� ������� � HashMap
            phoneNumbersMap.putAll(phoneNumbersMap);
        //������� � ������� ���� ������ �� ���������
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println(phone4);



    }
}
