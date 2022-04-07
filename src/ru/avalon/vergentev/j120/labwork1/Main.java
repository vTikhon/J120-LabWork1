package ru.avalon.vergentev.j120.labwork1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //задаём коллекцию HashSet (интерфейса Set) для хранения объектов PhoneNumber (задание 1)
        Set<PhoneNumbers> phoneNumbers = new HashSet<>();
            //создаём два объекта типа PhoneNumber
            PhoneNumbers phone1 = new PhoneNumbers(7962, 7051111);
            PhoneNumbers phone2 = new PhoneNumbers(7962, 7051112);
            //помещаем в нашу коллекцию два объекта наших типа PhoneNumber
            phoneNumbers.add(phone1);
            phoneNumbers.add(phone2);
        //выводим в консоль наши номера из коллекции HashSet
        System.out.println(phone1);
        System.out.println(phone2);



    }
}
