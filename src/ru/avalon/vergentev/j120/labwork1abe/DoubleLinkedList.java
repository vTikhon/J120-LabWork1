package ru.avalon.vergentev.j120.labwork1abe;

import java.util.*;

public class DoubleLinkedList<T> implements Iterable<T> {
    private Linker<T> head;
    private Linker<T> tail;

    //CONSTRUCTORS
    public DoubleLinkedList() {
        head = null;
        tail = null;
    }

    //METHODS
    //����� ������������ �������� �� ������� ������
    public boolean isEmpty() {
        return head == null;
    }

    //����� ���������� �������� � ������ ������
    public void addToBegin(T data) {
        Linker<T> element = new Linker<>(data);
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }

    //����� ���������� �������� � ����� ������
    public void addToEnd(T data) {
        Linker<T> element = new Linker<>(data);
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            tail.next = element;
            tail = element;
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
    //���������� ����� �������� �������� �� ����� ������ � ������ ����������� ������ (������-�� �� ��������)
//    public void removingFromEnd () {
//        if (head != tail) {
//            tail = tail.prev;
//        } else {
//            tail = null;
//        }
//    }

    //����� ����������� �� ���������� ��������� �������� (������� ��� ������������ ������)
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

    //����� ���������� ��������� ��������� � ������ ������
    public void addCollectionToBegin (ArrayList<T> arrayList) {
        for (int i = arrayList.size()-1; i >= 0; i--) {
            addToBegin(arrayList.get(i));
        }
    }
    //����� ���������� ��������� ��������� � ����� ������
    public void addCollectionToEnd (ArrayList<T> arrayList) {
        for (T i : arrayList) {
            addToEnd(i);
        }
    }

    //����� ��������� N-��� �������� (��������������� ����� ��� ���������� ���������� ������ �������)
    public T getElement (int N) {
        int i = 0;
        Linker<T> element = head;
        while (element != null && N != i) {
            i++;
            element = element.next;
        }
        if (N >= i) {
            assert element != null;
            return element.data;
        } else {
            throw new IllegalArgumentException ("index out of the range");
        }
    }

    //����� ����� ����� ������ (��������������� ����� ��� ���������� ���������� ������ �������)
    public int getLength () {
        int i = 0;
        Linker<T> element = head;
        while (element != null) {
            i++;
            element = element.next;
        }
        return i;
    }

    //����� ���������� ������ ������� � ����������� ��� � ������ ������
    public void absorptionListToBegin (DoubleLinkedList<T> list) {
        for (int i = list.getLength()-1; i >= 0; i--) {
            addToBegin(list.getElement(i));
            list.removingFromEnd();
        }
    }
    //����� ���������� ������ ������� � ����������� ��� � ����� ������
    public void absorptionListToEnd (DoubleLinkedList<T> list) {
        for (int i = 0; i < list.getLength(); i++) {
            addToEnd(list.getElement(i));
        }
        for (int i = list.getLength()-1; i >= 0; i--) {
            list.removingFromBegin();
        }
    }

    //�������� ����� ��������� ��������� � main ������ � ��������� ��� �������
    public void printInverse () {
        for (int i = getLength()-1; i >= 0; i--) {
            System.out.println(getElement(i));
        }
    }

    //����� ������ ������ 1.5 J120
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

    //����� �������� ����� ������ ���������� foreach
    public void printWithForEachFromBeginToEnd (DoubleLinkedList<T> doubleLinkedList) {
        for (T i : doubleLinkedList) {
            System.out.println(i);
        }
    }
    //����� �������� ����� ������ ���������� foreach
    public void printWithForEachFromEndToBegin (DoubleLinkedList<T> doubleLinkedList) {
        DoubleLinkedList<T> temp = new DoubleLinkedList<>();
        doubleLinkedList.forEach(temp::addToBegin);
        for (T i : temp) {
            System.out.println(i);
        }
    }
    //����� �������� ����� ������ �� ������ �� ��������� �������� ���������� foreach
    public void printAfterKeyInverse (DoubleLinkedList<T> doubleLinkedList, T phoneNumbers) {
        DoubleLinkedList<T> temp = new DoubleLinkedList<>();
        doubleLinkedList.forEach(temp::addToBegin);
        for (T i : temp) {
            System.out.println(i);
            if (i.equals(phoneNumbers)) {
                break;
            }
        }
    }
    //����� �������� ����� ������ �� ��������� �������� �� ������ ���������� foreach
    public void printUntilKeyInverse (DoubleLinkedList<T> doubleLinkedList, T phoneNumbers) {
        DoubleLinkedList<T> temp = new DoubleLinkedList<>();
        doubleLinkedList.forEach(temp::addToBegin);
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
