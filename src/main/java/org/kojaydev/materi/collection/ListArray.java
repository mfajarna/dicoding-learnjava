package org.kojaydev.materi.collection;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

    public static void main(String[] args){
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Merkurius");

        for(int i=0; i <planets.size(); i++){
            System.out.println(planets.get(i));
        }
    }
}
