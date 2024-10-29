package de.example.myOwnLinkedList;

public class Node<E> {
    E item;
    Node<E> next;

    public Node(E item){
        this.item = item;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" +  item +
                '}';
    }
}
