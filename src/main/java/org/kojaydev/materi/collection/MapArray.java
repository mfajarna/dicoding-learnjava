package org.kojaydev.materi.collection;

import java.util.HashMap;
import java.util.Map;

public class MapArray {
    public static void main(String[] args) {
        Map<String, Planet> planets = new HashMap<>();

        planets.put("key 1", new Planet("Earth", 0.03));
        planets.put("Key 2", new Planet("Mars", 0.44));
        planets.put("Key 3", new Planet("Merkurius", 0.44));

        for(Planet planet : planets.values()){
            System.out.println(planet);
        }
    }

}
