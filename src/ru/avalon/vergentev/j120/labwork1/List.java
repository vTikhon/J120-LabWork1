package ru.avalon.vergentev.j120.labwork1;

import java.util.Iterator;

public class List<T> implements Iterable<T> {
    private Linker<T> head;
    private Linker<T> tail;

    //Constructors
    public List() {
        head = null;
    }

    //Methods
    //метод определяющий является ли элемент пустым
    public boolean isEmpty() {
        return head == null;
    }

    //метод добавления элемента в начало списка
    public void addToBegin (T data) {
        Linker<T> element = new Linker<>(data);
        element.data = data;
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }
    //метод добавления элемента в конец списка
    public void addToEnd (T data) {
        Linker<T> element = new Linker<>(data);
        element.data = data;
        if (isEmpty()) {
            head = element;
        } else {
            tail.next = element;
        }
        tail = element;
    }

    //метод печатания заданного в main списка с проверкой его пустоты
    public void print () {
        Linker<T> element = head;
        if (element != null) {
            while (element != null) {
                System.out.println(element.data);
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }

    //метод извлечения элемента из начала списка
    public void extractionFromBegin () {
        Linker<T> element = head;
        System.out.println(element.data);
    }
    //метод извлечения элемента из конца списка
    public void extractionFromEnd () {
        Linker<T> element = tail;
        System.out.println(element.data);
    }

    //метод удаления элемента из начала списка
    public void removingFromBegin () {
        head = head.next;
    }
    //метод удаления элемента из конца списка
    public void removingFromEnd () {
        Linker<T> element = head;
        while (element != tail) {
            if (element.next == tail) {
                tail = element;
                tail.next = null; break;
            }
            element = element.next;
        }
    }

    //метод определения на содержание заданного значения
    public void keySearch (String key) {
        Linker<T> element = head;
        while (element != null) {
            if (element.data == key) {
                System.out.println("There is the searching element " + key + " at the list. ");
                System.out.print('\n');
            }
            element = element.next;
        }
    }

    //метод удаления из списка заданного значения
    public void keySearchAndRemove (String key) {
        Linker<T> element = head;
        Linker<T> previousElement = head;
        while (element.data != null && element.data != key) {
            previousElement = element;
            element = element.next;
        }

        if (isEmpty()) {
            head = head.next;
        } else {
            previousElement.next = element.next;
        }
    }

    //метод добавления к элементам списка заданного значения
    public void modifyElement (String mod) {
        Linker<T> element = head;
        if (element != null) {
            while (element != null) {
                element.data = (T) (element.data + mod);
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }

    //метод итератор - для того чтобы использовать for each по списку
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Linker<T> element = head;
            @Override
            public boolean hasNext() {
                return element != null;
            }
            @Override
            public T next() {
                T data = element.data;
                element = element.next;
                return data;
            }
        };
    }

    //метод перебора всего списка оператором for-each
    public void printWithForEach (List<PhoneNumbers> myList1) {
        for (PhoneNumbers i : myList1) {
            System.out.println(i);
        }
    }



    //Getters and Setters

}
