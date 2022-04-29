package ru.avalon.vergentev.j120.labwork1abe;
import java.util.*;

public class SingleLinkedList<T> implements Iterable<T> {
    private Linker<T> head;
    private Linker<T> tail;

    //CONSTRUCTORS
    public SingleLinkedList() {
        head = null;
    }

    //METHODS
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

    //метод извлечения элемента из начала списка
    public Linker<T> extractionFromBegin() {
        return head;
    }
    //метод извлечения элемента из конца списка
    public Linker<T> extractionFromEnd() {
        return tail;
    }

    //метод удаления элемента из начала списка
    public void removingFromBegin() {
        if (head != tail) {
            head = head.next;
        } else {
            head = null;
        }
    }

    //метод удаления элемента из конца списка
    public void removingFromEnd() {
        Linker<T> element = head;
        if (head != tail) {
            while (element != tail) {
                if (element.next == tail) {
                    tail = element;
                    tail.next = null;
                    break;
                }
                element = element.next;
            }
        } else {
            head = null;
        }
    }

    public Linker<T> keySearch(T key) {
        Linker<T> element = head;
        while (element != null) {
            if (Objects.equals(element.data, key)) {
                return element;
            }
            element = element.next;
        }
        return null;
    }

    //метод определения на содержание заданного значения
    public void keySearchAndRemove(T key) {
        Linker<T> element = head;
        Linker<T> previousElement = head;
        while (element.data != null && !element.data.equals(key)) {
            previousElement = element;
            element = element.next;
        }
        if (isEmpty()) {
            head = head.next;
        } else if (element == head) {
            head = head.next;
        } else {
            previousElement.next = element.next;
        }
    }

    //methods which are necessary for 1.2 J120
    //переопределение итератора для foreach
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

    //метод печати от начала списка до конца с использованием foreach
    public void printWithForEachFromBeginToEnd (SingleLinkedList<T> singleLinkedList) {
        for (T i : singleLinkedList) {
            System.out.println(i);
        }
    }

    //метод от начала списка до ключа foreach
    public void printUntilKey (SingleLinkedList<T> singleLinkedList, T phoneNumbers) {
        for (T i : singleLinkedList) {
            System.out.println(i);
            if (i.equals(phoneNumbers)) {
                break;
            }
        }
    }

    //метод от ключа до конца списка foreach
    public void printAfterKey (SingleLinkedList<T> singleLinkedList, T phoneNumbers) {
        DoubleLinkedList<T> temp = new DoubleLinkedList<>();
        for (T i : singleLinkedList) {
            temp.addToEnd(i);
        }
        for (T i : temp) {
            if (i.equals(phoneNumbers)) {
                break;
            } else {
                temp.removingFromBegin();
            }
        }
        for (T i : temp) {
            System.out.println(i);
        }
    }
}
