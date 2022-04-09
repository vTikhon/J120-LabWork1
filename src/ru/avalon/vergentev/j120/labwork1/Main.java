package ru.avalon.vergentev.j120.labwork1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //задаём коллекцию HashSet (интерфейса Set) для хранения объектов PhoneNumber (задание 1 j120)
        Set<PhoneNumbers> phoneNumbersSet = new HashSet<>();
        //задаём коллекцию HashMap (интерфейса Map) для хранения объектов PhoneNumber (задание 1 j120)
        Map<Long, String> phoneNumbersMap = new HashMap<>();
            //помещаем в Set (задание 1 j120)
            phoneNumbersSet.add(new PhoneNumbers(79627050000L));
            phoneNumbersSet.add(new PhoneNumbers(79627050001L));
            phoneNumbersSet.add(new PhoneNumbers(79627050002L));
            phoneNumbersSet.add(new PhoneNumbers(79627050003L));
            //помещаем в HashMap (задание 1 j120)
            phoneNumbersMap.put(79627050000L, "phone1");
            phoneNumbersMap.put(79627050001L, "phone2");
            phoneNumbersMap.put(79627050002L, "phone3");
            phoneNumbersMap.put(79627050003L, "phone4");
        //выводим в консоль наши номера из коллекций SetHash и MapHash (задание 1 j120)
        System.out.println(phoneNumbersSet);
        System.out.println(phoneNumbersMap);
        System.out.print('\n');

        //задаём односвязный список (из задания 3.1 j110) - задание 1.2 j120
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
