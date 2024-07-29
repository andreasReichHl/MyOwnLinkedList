package de.example.myOwnLinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myOwnList = new LinkedList();
        myOwnList.add(1);
        myOwnList.add(3);
        myOwnList.add(45);
        myOwnList.add(60);

//        System.out.println(myOwnList.getElement(2));

        myOwnList.add(2, 66);
        System.out.println(myOwnList.size());
//        myOwnList.printAll();

        myOwnList.remove(0);
        myOwnList.printAll();
//        System.out.println(myOwnList.getElement(1));
//        System.out.println(myOwnList.getHead());

//        java.util.LinkedList<Integer> integerLinkedList = new java.util.LinkedList<>();
//        integerLinkedList.add(2,13);
    }
}
