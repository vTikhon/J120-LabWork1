package ru.avalon.vergentev.j120.labwork1;

public class List {
    private Linker head;
    private Linker tail;

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
    //метод добавления элемента в конец списка
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

    //метод печатания заданного в main списка с проверкой его пустоты
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

    //метод извлечения элемента из начала списка
    public void extractionFromBegin () {
        Linker element = head;
        System.out.println(element.data);
    }
    //метод извлечения элемента из конца списка
    public void extractionFromEnd () {
        Linker element = tail;
        System.out.println(element.data);
    }

    //метод удаления элемента из начала списка
    public void removingFromBegin () {
        head = head.next;
    }
    //метод удаления элемента из конца списка
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

    //метод определения на содержание заданного значения
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

    //метод удаления из списка заданного значения
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

    //метод добавления к элементам списка заданного значения
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
