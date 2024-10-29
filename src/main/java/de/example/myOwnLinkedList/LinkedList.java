package de.example.myOwnLinkedList;

public class LinkedList<E> {
    private Node<E> head;

    public LinkedList() {

    }

    public Node<E> getHead() {
        return head;
    }

    public void add(E item) {
        Node<E> newNode = new Node<>(item);
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

    public void add(int index, E item) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }

        Node<E> newNode = new Node<>(item);
        if (index == 0) {
            newNode.next = head;
            head.next = newNode;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) throw new IndexOutOfBoundsException("Index:" + index);
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void addFirst(E item) {
        Node<E> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    private Node<E> getLastElement() {
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

    public Node<E> getElement(int i) {
        if (head == null || i > size()) throw new IndexOutOfBoundsException();
        Node current = head;
        int index = 0;
        while (index < i) {
            current = current.next;
            ++index;
        }
        return current;
    }

    public StringBuilder printAll() {
        Node<E> current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("Elemente der LinkedList: ");
        sb.append("\n");
        for (int i = 0; i < size(); i++) {
            sb.append("index: " + i + "| ");
            sb.append(current.toString());
            sb.append("\n");
            current = current.next;
        }
        return sb;
    }

    public void remove(int index) {
        if (index < -1) throw new IndexOutOfBoundsException("Index: " + index);

        if (index == 0) {
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current == null) throw new IndexOutOfBoundsException("Index:" + index);
                current = current.next;
            }
            if (current.next == null) throw new IndexOutOfBoundsException("Index:" + index);
            current.next = current.next.next;
        }

    }

    public void removeLast() {
        if (head == null) throw new IndexOutOfBoundsException();
        int indexLast = size() - 1;
        remove(indexLast);
    }

    public void reverse() {
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;

        head.next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
}
