package de.example.linkedList;

import java.util.Comparator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Alice");
        students.add("Eve");

        students.addFirst("Zara");
        students.addLast("Fred");

        System.out.println("Ausgabe erstes und letztes Element");
        System.out.println(students.getFirst());
        System.out.println(students.getLast());
        System.out.println("");

        students.removeFirst();
        students.removeLast();

        System.out.println("Ausgabe ob Elemente enthalten sind");
        System.out.println(students.contains("Alice"));
        System.out.println(students.contains("Eve"));
        System.out.println("");


        System.out.println("Unsortierte Liste");
        students.forEach(System.out::println);
        System.out.println("");


        LinkedList<String> newStudents = new LinkedList<>();
        newStudents.add("George");
        newStudents.add("Hannae");

        students.addAll(newStudents);
        System.out.println("Sortierte LinkedList:");
        students.sort(Comparator.naturalOrder());
        students.forEach(System.out::println);

    }
}
