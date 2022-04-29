package ru.avalon.vergentev.j120.labwork1abe;
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
        myList1.printWithForEachFromBeginToEnd(myList1); //печатаем список методом for each (для этого определили итератор)
        System.out.print('\n');
        System.out.println("Print list until the set element:");
        myList1.printUntilKey(myList1, new PhoneNumbers(79627050005L)); //печатаем до заданного значения (если элемента нет, то выводим всё)
        System.out.println("Print list after the set element:");
        myList1.printAfterKey(myList1, new PhoneNumbers(79627050006L)); //печатаем после заданного значения (если элемента нет, то ничего не выводим)
        System.out.print('\n');
        System.out.println("Searching the element:");
        System.out.println(myList1.keySearch(new PhoneNumbers(79627050004L))); //ищем заданный элемент
        myList1.keySearchAndRemove(new PhoneNumbers(79627050004L)); //ищем и удаляем заданный элемент
        System.out.println("Modified list after removing the element:");
        myList1.printWithForEachFromBeginToEnd(myList1); //печатаем список методом for each (для этого определили итератор)
        System.out.print('\n');
        System.out.println("Extracted elements from begin and end:");
        System.out.println(myList1.extractionFromBegin());
        System.out.println(myList1.extractionFromEnd());
        System.out.println("Removing elements from begin and end:");
        myList1.removingFromBegin(); //удаляем элемент начала списка
        myList1.removingFromEnd(); //удаляем элемент конца списка
        myList1.printWithForEachFromBeginToEnd(myList1); //печатаем список методом for each (для этого определили итератор)


        //>>>>>>>>>>>>>>>>>>>>>>>>>>>>ЗАДАНИЕ 1.5<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //создаём двусвязный список (задание 1.5 j120)
        DoubleLinkedList<PhoneNumbers> myList = new DoubleLinkedList<>();
        myList.addToEnd(new PhoneNumbers(79627055555L));
        myList.addToEnd(new PhoneNumbers(79627056666L));
        myList.addToBegin(new PhoneNumbers(79627054444L));
        System.out.print('\n');
        System.out.println("The new list1 is:");
        myList.printWithForEachFromEndToBegin(myList); //выводим наш список в обратном порядке
        //задаём коллекцию ArrayList (аналогично заданию 3.2 j110) - задание 1.5 j120
        ArrayList<PhoneNumbers> myArrayList = new ArrayList<>(); // задаём коллекцию ArrayList
        myArrayList.add(new PhoneNumbers(11111111111L));
        myArrayList.add(new PhoneNumbers(22222222222L));
        myList.addCollectionToBegin(myArrayList); //добавляем элементы коллекции в начало списка
        myList.addCollectionToEnd(myArrayList); //добавляем элементы коллекции в конец списка
        System.out.print('\n');
        System.out.println("Modified list1 with arrayList is:");
        myList.printWithForEachFromEndToBegin(myList); //выводим наш список в обратном порядке
        //задаём два списка, которые будем поглощать и аннулировать (аналогично заданию 3.2 j110) - задание 1.5 j120
        DoubleLinkedList<PhoneNumbers> myList2 = new DoubleLinkedList<>();
        myList2.addToEnd(new PhoneNumbers(79627052222L));
        myList2.addToEnd(new PhoneNumbers(79627053333L));
        myList2.addToBegin(new PhoneNumbers(79627051111L));
        DoubleLinkedList<PhoneNumbers> myList3 = new DoubleLinkedList<>();
        myList3.addToEnd(new PhoneNumbers(79627058888L));
        myList3.addToEnd(new PhoneNumbers(79627059999L));
        myList3.addToBegin(new PhoneNumbers(79627057777L));
        myList.absorptionListToBegin(myList2); //поглощаем myList2 первым списком myList с добавлением элементом в начало списка, затем удаляем поглощённый список
        myList.absorptionListToEnd(myList3); //поглощаем myList3 первым списком myList с добавлением элементом в конец списка, затем удаляем поглощённый список
        System.out.print('\n');
        System.out.println("Modified list1 with absorption list2 at the begin and list3 at the end:");
        myList.printWithForEachFromBeginToEnd(myList); //выводим наш список в обратном порядке
        System.out.println("Are the lists 2 and 3 null? Lists are:");
        myList2.printWithForEachFromBeginToEnd(myList2); //проверяем что List2 стал пустым
        myList3.printWithForEachFromBeginToEnd(myList3); //проверяем что List3 стал пустым
        System.out.print('\n');
        System.out.println("Print list after the set element (from tail to element):");
        myList.printAfterKeyInverse(myList, new PhoneNumbers(11111111111L));  //печатаем от хвоста до заданного значения (если элемента нет, то выводим всё)
        System.out.println("Print list after the set element (from element to head):");
        myList.printUntilKeyInverse(myList, new PhoneNumbers(79627054444L));  //печатаем от заданного значения до головы списка (если элемента нет, то ничего не выводим)
        System.out.print('\n');


    }
}
