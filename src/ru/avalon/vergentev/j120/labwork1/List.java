package ru.avalon.vergentev.j120.labwork1;

public class List {
    private Linker head;
    private Linker tail;

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
    public void addToBegin (String data) {
        Linker element = new Linker(data);
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
    public void addToEnd (String data) {
        Linker element = new Linker(data);
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
        Linker element = head;
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
        Linker element = head;
        System.out.println(element.data);
    }
    //����� ���������� �������� �� ����� ������
    public void extractionFromEnd () {
        Linker element = tail;
        System.out.println(element.data);
    }

    //����� �������� �������� �� ������ ������
    public void removingFromBegin () {
        head = head.next;
    }
    //����� �������� �������� �� ����� ������
    public void removingFromEnd () {
        Linker element = head;
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
        Linker element = head;
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
        Linker element = head;
        Linker previousElement = head;
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
        Linker element = head;
        if (element != null) {
            while (element != null) {
                element.data = element.data + mod;
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }


    //Getters and Setters

}
