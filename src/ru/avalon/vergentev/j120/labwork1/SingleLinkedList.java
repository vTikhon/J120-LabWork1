package ru.avalon.vergentev.j120.labwork1;

import java.util.Iterator;
import java.util.Objects;

public class SingleLinkedList<T> implements Iterable<T> {
    private Linker<T> head;
    private Linker<T> tail;

    //Constructors
    public SingleLinkedList() {
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
    public void print() {
        try {
            Linker<T> element = head;
            while (element != null) {
                System.out.println(element.data);
                element = element.next;
            }
            System.out.print('\n');
        } catch (IllegalArgumentException e) {
            System.out.println(("The list is null. "));
        }
    }

    //����� ���������� �������� �� ������ ������ (������� ��� ������������ ������)
    public Linker<T> extractionFromBegin() {
        return head;
    }

    //����� ���������� �������� �� ����� ������ (������� ��� ������������ ������)
    public Linker<T> extractionFromEnd() {
        return tail;
    }

    //����� �������� �������� �� ������ ������ (������� ��� ������������ ������)
    public void removingFromBegin() {
        if (head != tail) {
            head = head.next;
        } else {
            head = null;
        }
    }
    //����� �������� �������� �� ����� ������ (������� ��� ������������ ������)
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

    //����� ����������� �� ���������� ��������� ��������
    public Linker<T> keySearch(String key) {
        Linker<T> element = head;
        while (element != null) {
            if (Objects.equals(element.data, key)) {
                return element;
            }
            element = element.next;
        }
        return null;
    }

    //����� �������� �� ������ ��������� �������� (������� ��� ������������ ������)
    public void keySearchAndRemove(String key) {
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

    //����� ��, ��� � ������� ��� ���������� ������ 1.2 J120
    //����� �������� - ��� ���� ����� ������������ for each �� ������
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
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
    public void printWithForEach (SingleLinkedList<PhoneNumbers> mySingleLinkedList1) {
        for (PhoneNumbers i : mySingleLinkedList1) {
            System.out.println(i);
        }
    }
    //����� �������� ����� ������ ���������� for-each �� ��������� ��������
    public void printUntilKey (SingleLinkedList<PhoneNumbers> singleLinkedList, PhoneNumbers phoneNumbers) {
        for (PhoneNumbers i : singleLinkedList) {
            System.out.println(i);
            if (i.equals(phoneNumbers)) {
                break;
            }
        }
    }
    //����� �������� ����� ������ ���������� for-each ����� ��������� ��������
    public void printAfterKey (SingleLinkedList<PhoneNumbers> singleLinkedList, PhoneNumbers phoneNumbers) {
        int s = 0;
        int n = 0;
        for (PhoneNumbers i : singleLinkedList) {
            s++;
            if (i.equals(phoneNumbers)) {
                n = s-1;
            }
        }
        for (; n < singleLinkedList.getLength(); n++) {
            System.out.println(getElement(n));
        }
    }

    //����� ��������� N-��� �������� (��������������� �����)
    public T getElement (int N) {
        try {
            int i = 0;
            Linker<T> element = head;
            while (element != null && N != i) {
                i++;
                element = element.next;
            }
            if (N >= i) {
                assert element != null;
                return element.data;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("index out of the range");
        }
        return null;
    }

    //����� ����� ����� ������ (��������������� �����)
    public int getLength () {
        int i = 0;
        Linker<T> element = head;
        while (element != null) {
            i++;
            element = element.next;
        }
        return i;
    }



    //Getters and Setters

}
