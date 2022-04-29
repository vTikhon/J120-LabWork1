package ru.avalon.vergentev.j120.labwork1abe;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>������� 1.1<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
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


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>������� 1.2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //����� ����������� ������ (���������� ������� 3.1 j110) - ������� 1.2 j120
        SingleLinkedList<PhoneNumbers> myList1 = new SingleLinkedList<>();
            myList1.addToEnd(new PhoneNumbers(79627050005L)); //��������� �������� � �����
            myList1.addToEnd(new PhoneNumbers(79627050006L));
            myList1.addToEnd(new PhoneNumbers(79627050007L));
            myList1.addToEnd(new PhoneNumbers(79627050008L));
            myList1.addToBegin(new PhoneNumbers(79627050004L)); //��������� �������� � ������
            myList1.addToBegin(new PhoneNumbers(79627050003L));
            myList1.addToBegin(new PhoneNumbers(79627050002L));
            myList1.addToBegin(new PhoneNumbers(79627050001L));
        System.out.println("Print list:");
        myList1.printWithForEachFromBeginToEnd(myList1); //�������� ������ ������� for each (��� ����� ���������� ��������)
        System.out.print('\n');
        System.out.println("Print list until the set element:");
        myList1.printUntilKey(myList1, new PhoneNumbers(79627050005L)); //�������� �� ��������� �������� (���� �������� ���, �� ������� ��)
        System.out.println("Print list after the set element:");
        myList1.printAfterKey(myList1, new PhoneNumbers(79627050006L)); //�������� ����� ��������� �������� (���� �������� ���, �� ������ �� �������)
        System.out.print('\n');
        System.out.println("Searching the element:");
        System.out.println(myList1.keySearch(new PhoneNumbers(79627050004L))); //���� �������� �������
        myList1.keySearchAndRemove(new PhoneNumbers(79627050004L)); //���� � ������� �������� �������
        System.out.println("Modified list after removing the element:");
        myList1.printWithForEachFromBeginToEnd(myList1); //�������� ������ ������� for each (��� ����� ���������� ��������)
        System.out.print('\n');
        System.out.println("Extracted elements from begin and end:");
        System.out.println(myList1.extractionFromBegin());
        System.out.println(myList1.extractionFromEnd());
        System.out.println("Removing elements from begin and end:");
        myList1.removingFromBegin(); //������� ������� ������ ������
        myList1.removingFromEnd(); //������� ������� ����� ������
        myList1.printWithForEachFromBeginToEnd(myList1); //�������� ������ ������� for each (��� ����� ���������� ��������)


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>������� 1.5<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //������ ���������� ������ (������� 1.5 j120)
        DoubleLinkedList<PhoneNumbers> myList = new DoubleLinkedList<>();
            myList.addToEnd(new PhoneNumbers(79627055555L));
            myList.addToEnd(new PhoneNumbers(79627056666L));
            myList.addToBegin(new PhoneNumbers(79627054444L));
        System.out.print('\n');
        System.out.println("The new list1 is:");
        myList.printWithForEachFromEndToBegin(myList); //������� ��� ������ � �������� �������
        //����� ��������� ArrayList (���������� ������� 3.2 j110) - ������� 1.5 j120
        ArrayList<PhoneNumbers> myArrayList = new ArrayList<>(); // ����� ��������� ArrayList
            myArrayList.add(new PhoneNumbers(11111111111L));
            myArrayList.add(new PhoneNumbers(22222222222L));
        myList.addCollectionToBegin(myArrayList); //��������� �������� ��������� � ������ ������
        myList.addCollectionToEnd(myArrayList); //��������� �������� ��������� � ����� ������
        System.out.print('\n');
        System.out.println("Modified list1 with arrayList is:");
        myList.printWithForEachFromEndToBegin(myList); //������� ��� ������ � �������� �������
        //����� ��� ������, ������� ����� ��������� � ������������ (���������� ������� 3.2 j110) - ������� 1.5 j120
        DoubleLinkedList<PhoneNumbers> myList2 = new DoubleLinkedList<>();
            myList2.addToEnd(new PhoneNumbers(79627052222L));
            myList2.addToEnd(new PhoneNumbers(79627053333L));
            myList2.addToBegin(new PhoneNumbers(79627051111L));
        DoubleLinkedList<PhoneNumbers> myList3 = new DoubleLinkedList<>();
            myList3.addToEnd(new PhoneNumbers(79627058888L));
            myList3.addToEnd(new PhoneNumbers(79627059999L));
            myList3.addToBegin(new PhoneNumbers(79627057777L));
        myList.absorptionListToBegin(myList2); //��������� myList2 ������ ������� myList � ����������� ��������� � ������ ������, ����� ������� ����������� ������
        myList.absorptionListToEnd(myList3); //��������� myList3 ������ ������� myList � ����������� ��������� � ����� ������, ����� ������� ����������� ������
        System.out.print('\n');
        System.out.println("Modified list1 with absorption list2 at the begin and list3 at the end:");
        myList.printWithForEachFromBeginToEnd(myList); //������� ��� ������ � �������� �������
        System.out.println("Are the lists 2 and 3 null? Lists are:");
        myList2.printWithForEachFromBeginToEnd(myList2); //��������� ��� List2 ���� ������
        myList3.printWithForEachFromBeginToEnd(myList3); //��������� ��� List3 ���� ������
        System.out.print('\n');
        System.out.println("Print list after the set element (from tail to element):");
        myList.printAfterKeyInverse(myList, new PhoneNumbers(11111111111L));  //�������� �� ������ �� ��������� �������� (���� �������� ���, �� ������� ��)
        System.out.println("Print list after the set element (from element to head):");
        myList.printUntilKeyInverse(myList, new PhoneNumbers(79627054444L));  //�������� �� ��������� �������� �� ������ ������ (���� �������� ���, �� ������ �� �������)
        System.out.print('\n');


    }
}
