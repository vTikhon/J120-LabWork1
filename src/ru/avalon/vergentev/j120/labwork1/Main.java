package ru.avalon.vergentev.j120.labwork1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //����� ��������� HashSet (���������� Set) ��� �������� �������� PhoneNumber (������� 1 j120)
        Set<PhoneNumbers> phoneNumbersSet = new HashSet<>();
        //����� ��������� HashMap (���������� Map) ��� �������� �������� PhoneNumber (������� 1 j120)
        Map<Long, String> phoneNumbersMap = new HashMap<>();
            //�������� � Set (������� 1 j120)
            phoneNumbersSet.add(new PhoneNumbers(79627050000L));
            phoneNumbersSet.add(new PhoneNumbers(79627050001L));
            phoneNumbersSet.add(new PhoneNumbers(79627050002L));
            phoneNumbersSet.add(new PhoneNumbers(79627050003L));
            //�������� � HashMap (������� 1 j120)
            phoneNumbersMap.put(79627050000L, "phone1");
            phoneNumbersMap.put(79627050001L, "phone2");
            phoneNumbersMap.put(79627050002L, "phone3");
            phoneNumbersMap.put(79627050003L, "phone4");
        //������� � ������� ���� ������ �� ��������� SetHash � MapHash (������� 1 j120)
        System.out.println(phoneNumbersSet);
        System.out.println(phoneNumbersMap);
        System.out.print('\n');

        //����� ����������� ������ (�� ������� 3.1 j110) - ������� 1.2 j120
        List myList1 = new List();
        myList1.addToEnd("aaa");
        myList1.addToEnd("bbb");
        myList1.addToEnd("ccc");
        myList1.addToEnd("ddd");
        myList1.addToBegin("DDD");
        myList1.addToBegin("CCC");
        myList1.addToBegin("BBB");
        myList1.addToBegin("AAA");
        myList1.print();



    }
}
