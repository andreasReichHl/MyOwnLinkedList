package de.example.myOwnLinkedList;

public class Main {
    public static void main(String[] args) {
        // Implementierung einer LinkedLIst
        // Folgende Methode sind implementiert:
        // add(item), getElement(index), remove(index), removeLast(),
        // printAll()

        LinkedList<String> myOwnList = new LinkedList<>();
        myOwnList.add("Andreas");
        myOwnList.add("Christian");
        myOwnList.add("Superman");
        myOwnList.add("Wonderwoman");
//        System.out.println(myOwnList.printAll());

//        System.out.println(myOwnList.getElement(2));

        myOwnList.add(2, "Flash");
//        System.out.println(myOwnList.printAll());
        myOwnList.addFirst("Batman");

//        myOwnList.remove(4);
//        myOwnList.removeLast();
//        System.out.println(myOwnList.printAll());
        myOwnList.reverse();
        System.out.println(myOwnList.printAll());


    }
}
