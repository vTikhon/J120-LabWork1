package ru.avalon.vergentev.j120.labwork1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //����� ��������� HashSet (���������� Set) ��� �������� �������� PhoneNumber (������� 1.1 j120)
        Set<PhoneNumbers> phoneNumbersSet = new HashSet<>();
            //�������� � Set (������� 1.1 j120)
            phoneNumbersSet.add(new PhoneNumbers(79627050000L));
            phoneNumbersSet.add(new PhoneNumbers(79627050001L));
            phoneNumbersSet.add(new PhoneNumbers(79627050002L));
            phoneNumbersSet.add(new PhoneNumbers(79627050003L));
        //����� ��������� HashMap (���������� Map) ��� �������� �������� PhoneNumber (������� 1.1 j120)
        Map<Long, String> phoneNumbersMap = new HashMap<>();
            //�������� � HashMap (������� 1.1 j120)
            phoneNumbersMap.put(79627050004L, "phone1");
            phoneNumbersMap.put(79627050005L, "phone2");
            phoneNumbersMap.put(79627050006L, "phone3");
            phoneNumbersMap.put(79627050007L, "phone4");
        //������� � ������� ���� ������ �� ��������� SetHash � MapHash (������� 1.1 j120)
        System.out.println(phoneNumbersSet);
        System.out.println(phoneNumbersMap);
        System.out.print('\n');

        //����� ����������� ������ (���������� ������� 3.1 j110) - ������� 1.2 j120
        List<PhoneNumbers> myList1 = new List<>();
            myList1.addToEnd(new PhoneNumbers(79627050005L));
            myList1.addToEnd(new PhoneNumbers(79627050006L));
            myList1.addToEnd(new PhoneNumbers(79627050007L));
            myList1.addToEnd(new PhoneNumbers(79627050008L));
            myList1.addToBegin(new PhoneNumbers(79627050004L));
            myList1.addToBegin(new PhoneNumbers(79627050003L));
            myList1.addToBegin(new PhoneNumbers(79627050002L));
            myList1.addToBegin(new PhoneNumbers(79627050001L));
//        myList1.printWithForEach(myList1);  //�������� ������� for each (��� ����� ���������� ��������)
        myList1.printUntilKey(myList1, new PhoneNumbers(79627050005L)); //�������� �� ��������� ��������
        myList1.printAfterKey(myList1, new PhoneNumbers(79627050003L)); //�������� �� ��������� ��������



    }
}
