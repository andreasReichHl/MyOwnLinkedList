package de.example.myOwnLinkedList;

public class LinkedList {
    private Node head;

    public LinkedList() {

    }

    public Node getHead() {
        return head;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void add(int index, int data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head.next = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) throw new IndexOutOfBoundsException("Index:" + index);
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    private Node getLastElement() {
        Node current = head;
        while (current != null) current = current.next;
        return current;
    }

    public int size() {
        int size = 1;
        if (head == null) return size;
        Node current = head;
        while (current.next != null) {
            ++size;
            current = current.next;
        }
        return size;
    }

    public Node getElement(int i) {
        if (head == null || i > size()) throw new IndexOutOfBoundsException();
        Node current = head;
        int index = 0;
        while (index < i) {
            current = current.next;
            ++index;
        }
        return current;
    }

    public void printAll() {
        Node current = head;
//            System.out.println(size());
        for (int i = 0; i < size(); i++) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void remove(int index) {
        if (index < -1) throw new IndexOutOfBoundsException("Index: " + index);

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) throw new IndexOutOfBoundsException("Index:" + index);
                current = current.next;
            }
            if (current == null) throw new IndexOutOfBoundsException("Index:" + index);
            current.next = current.next.next;
        }
    }
}
