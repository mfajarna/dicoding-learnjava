package org.kojaydev.materi.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetArray {
    // Set Array
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Pluto");

        // Shorthand looping
//        for(String planet : planets){
//            System.out.println(planet);
//        }

        System.out.println(planets.size());
        // looping with iterator
        for(Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
