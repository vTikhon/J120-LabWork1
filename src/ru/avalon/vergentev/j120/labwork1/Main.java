package ru.avalon.vergentev.j120.labwork1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>ЗАДАНИЕ 1.1<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //задаём коллекцию HashSet (интерфейса Set) для хранения объектов PhoneNumber (задание 1.1 j120)
        Set<PhoneNumbers> phoneNumbersSet = new HashSet<>();
            //помещаем в Set (задание 1.1 j120)
            phoneNumbersSet.add(new PhoneNumbers(79627050000L));
            phoneNumbersSet.add(new PhoneNumbers(79627050001L));
            phoneNumbersSet.add(new PhoneNumbers(79627050002L));
            phoneNumbersSet.add(new PhoneNumbers(79627050003L));
        //задаём коллекцию HashMap (интерфейса Map) для хранения объектов PhoneNumber (задание 1.1 j120)
        Map<Long, String> phoneNumbersMap = new HashMap<>();
            //помещаем в HashMap (задание 1.1 j120)
            phoneNumbersMap.put(79627050004L, "phone1");
            phoneNumbersMap.put(79627050005L, "phone2");
            phoneNumbersMap.put(79627050006L, "phone3");
            phoneNumbersMap.put(79627050007L, "phone4");
        //выводим в консоль наши номера из коллекций SetHash и MapHash (задание 1.1 j120)
        System.out.println(phoneNumbersSet);
        System.out.println(phoneNumbersMap);
        System.out.print('\n');

        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>ЗАДАНИЕ 1.2<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //задаём односвязный список (аналогично заданию 3.1 j110) - задание 1.2 j120
        SingleLinkedList<PhoneNumbers> myList1 = new SingleLinkedList<>();
            myList1.addToEnd(new PhoneNumbers(79627050005L)); //добавляем элементы в конец
            myList1.addToEnd(new PhoneNumbers(79627050006L));
            myList1.addToEnd(new PhoneNumbers(79627050007L));
            myList1.addToEnd(new PhoneNumbers(79627050008L));
            myList1.addToBegin(new PhoneNumbers(79627050004L)); //добавляем элементы в начало
            myList1.addToBegin(new PhoneNumbers(79627050003L));
            myList1.addToBegin(new PhoneNumbers(79627050002L));
            myList1.addToBegin(new PhoneNumbers(79627050001L));
        System.out.println("Print list:");
        myList1.printWithForEach(myList1);  //печатаем методом for each (для этого определили итератор)
        System.out.print('\n');
        System.out.println("Print list until the set element:");
        myList1.printUntilKey(myList1, new PhoneNumbers(79627050005L)); //печатаем до заданного значения
        System.out.println("Print list after the set element:");
        myList1.printAfterKey(myList1, new PhoneNumbers(79627050003L)); //печатаем до заданного значения
        System.out.print('\n');
        System.out.println("Searching the element:");
        System.out.println(myList1.keySearch(new PhoneNumbers(79627050004L))); //ищем заданный элемент
        myList1.keySearchAndRemove(new PhoneNumbers(79627050004L)); //ищем и удаляем заданный элемент
        System.out.println("Modified list after removing the element:");
        myList1.print();
        System.out.print('\n');
        System.out.println("Extracted elements from begin and end:");
        System.out.println(myList1.extractionFromBegin());
        System.out.println(myList1.extractionFromEnd());
        System.out.println("Removing elements from begin and end:");
        myList1.removingFromBegin(); //удаляем элемент начала списка
        myList1.removingFromEnd(); //удаляем элемент конца списка
        myList1.print();


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>ЗАДАНИЕ 1.5<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //создаём двусвязный список (задание 1.5 j120)
        DoubleLinkedList<PhoneNumbers> myList = new DoubleLinkedList<>();
        myList.addToEnd(new PhoneNumbers(79627055555L));
        myList.addToEnd(new PhoneNumbers(79627056666L));
        myList.addToBegin(new PhoneNumbers(79627054444L));
        System.out.println("The new list1 is:");
        myList.print(); //выводим наш список

        //задаём коллекцию ArrayList (аналогично заданию 3.1 j110) - задание 1.5 j120
        ArrayList<PhoneNumbers> myArrayList = new ArrayList<>(); // задаём коллекцию ArrayList
        myArrayList.add(new PhoneNumbers(11111111111L));
        myArrayList.add(new PhoneNumbers(22222222222L));
        myArrayList.add(new PhoneNumbers(33333333333L));
        myList.addCollectionToBegin(myArrayList); //добавляем элементы коллекции в начало списка
        myList.addCollectionToEnd(myArrayList); //добавляем элементы коллекции в конец списка
        System.out.println("Modified list with arrayList is:");
        myList.print(); //выводим изменённый список на экран

        DoubleLinkedList<PhoneNumbers> myList2 = new DoubleLinkedList<>();
        myList2.addToEnd(new PhoneNumbers(79627052222L));
        myList2.addToEnd(new PhoneNumbers(79627053333L));
        myList2.addToBegin(new PhoneNumbers(79627051111L));
        System.out.println("The new list2 is:");
        myList2.print(); //выводим наш список
        myList.absorptionListToBegin(myList2); //поглощаем созданный список первым списком с добавлением элементом в начало списка, затем удаляем поглощённый список
        System.out.println("Modified list1 with absorption list2 at the begin:");
        myList.print();
        System.out.println("Is the list2 null? List2 is:");
        myList2.print(); //проверяем что List2 стал пустым

        DoubleLinkedList<PhoneNumbers> myList3 = new DoubleLinkedList<>();
        myList3.addToEnd(new PhoneNumbers(79627058888L));
        myList3.addToEnd(new PhoneNumbers(79627059999L));
        myList3.addToBegin(new PhoneNumbers(79627057777L));
        System.out.println("The new list3 is:");
        myList3.print(); //выводим наш список
        myList.absorptionListToEnd(myList3); //поглощаем созданный список первым списком с добавлением элементом в конец списка, затем удаляем поглощённый список
        System.out.println("Modified list1 with absorption list3 at the end:");
        myList.print();
        System.out.println("Is the list3 null? List3 is:");
        myList3.print(); //проверяем что List3 стал пустым



    }
}
