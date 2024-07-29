package de.example.kollabierteListen;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Integer[] array = {1, 1, 2, 2, 3, 1, 1};
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(array));

        collapseDuplicates(list).forEach(System.out::println);
    }

    public static LinkedList<Integer> collapseDuplicates(LinkedList<Integer> list) {
        if(list.isEmpty() || list.size() <2) return list;

        Iterator<Integer> it = list.iterator();
        Integer previous = it.next();

        while(it.hasNext()){
            Integer current = it.next();
            if(current.equals(previous)){
                it.remove();
            }else{
                previous = current;
            }
        }

        return list;
    }
}
