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
    //����� ������������ �������� �� ������� ������
    public boolean isEmpty() {
        return head == null;
    }

    //����� ���������� �������� � ������ ������
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
    //����� ���������� �������� � ����� ������
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

    //����� ��������� ��������� � main ������ � ��������� ��� �������
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

    //����� ���������� �������� �� ������ ������
    public void extractionFromBegin () {
        Linker<T> element = head;
        System.out.println(element.data);
    }
    //����� ���������� �������� �� ����� ������
    public void extractionFromEnd () {
        Linker<T> element = tail;
        System.out.println(element.data);
    }

    //����� �������� �������� �� ������ ������
    public void removingFromBegin () {
        head = head.next;
    }
    //����� �������� �������� �� ����� ������
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

    //����� ����������� �� ���������� ��������� ��������
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

    //����� �������� �� ������ ��������� ��������
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

    //����� ���������� � ��������� ������ ��������� ��������
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

    //����� �������� - ��� ���� ����� ������������ for each �� ������
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

    //����� �������� ����� ������ ���������� for-each
    public void printWithForEach (List<PhoneNumbers> myList1) {
        for (PhoneNumbers i : myList1) {
            System.out.println(i);
        }
    }



    //Getters and Setters

}
