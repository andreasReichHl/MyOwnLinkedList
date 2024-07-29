package de.example.compareSpeedLinkedAndArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static  void main(String[] args) {
        int numElements = 100000;
        long startTime;
        long endTime;

        ArrayList<String> playlistArrayList = new ArrayList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            playlistArrayList.add("Song " + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - Hinzufügen von " + numElements + " Songs: " + (endTime - startTime) + " ms");

        LinkedList<String> playlistLinkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < numElements; i++) {
            playlistLinkedList.add("Song " + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - Hinzufügen von " + numElements + " Songs: " + (endTime - startTime) + " ms");

        // ein Element am Anfang einsetzen
        startTime = System.currentTimeMillis();
        playlistArrayList.addFirst("First-Element");
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - ein Element an erster Stelle  einfügen " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        playlistLinkedList.addFirst("First-Element");
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - ein Element an erster Stelle  einfügen " + (endTime - startTime) + " ms");

        // ein Element in der Mitte entfernen
        startTime = System.currentTimeMillis();
        playlistArrayList.remove(playlistArrayList.get(numElements/2));
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - ein Element aus der Mitte löschen " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        playlistLinkedList.remove(playlistLinkedList.get(numElements/2));
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - ein Element aus der Mitte löschen " + (endTime - startTime) + " ms");

        // auf ein Element aus der Mitte zugreifen
        startTime = System.currentTimeMillis();
        System.out.print(playlistArrayList.get(numElements/2));
        endTime = System.currentTimeMillis();
        System.out.println(" ArrayList - ein Element aus der Mitte löschen " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        System.out.print(playlistLinkedList.get(numElements/2));
        endTime = System.currentTimeMillis();
        System.out.println(" LinkedList - ein Element aus der Mitte löschen " + (endTime - startTime) + " ms");

        // durch die Listen iterieren
        startTime = System.currentTimeMillis();
        for (String s : playlistArrayList);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - einmal vollständig durch die Liste iteriert " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (String s : playlistLinkedList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - einmal vollständig durch die Liste iteriert " + (endTime - startTime) + " ms");

        // das erste Element der Listen löschen
        startTime = System.currentTimeMillis();
        playlistArrayList.removeFirst();
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList - das erste Element wurde gelöscht " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        playlistLinkedList.removeFirst();
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList - das erste Element wurde gelöscht " + (endTime - startTime) + " ms");
    }
}
