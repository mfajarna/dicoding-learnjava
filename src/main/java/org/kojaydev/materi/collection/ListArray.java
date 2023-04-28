package org.kojaydev.materi.collection;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

    public static void main(String[] args){
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Merkurius");

        for(String planet: planets){
            System.out.println(planet);
        }
    }
}
