package org.kojaydev.materi.commonclass.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List lo = new ArrayList();
//        lo.add("Lo - String 1");
//        lo.add(new Planet("Mercury", 0.07));
//
//        for(Object o : lo){
//            Planet pl = (Planet) o; // perlu type-casting dari object ke planet
//            pl.print();
//        }

        List<Planet> lp = new ArrayList<>();
        lp.add(new Planet("Mercury", 0.02));
        lp.add(new Planet("Earth", 20.2));

        Collection<Planet> cp = new ArrayList<>();
        cp.add(new Planet("Mercury", 0.02));
        cp.add(new Planet("Earth", 20.2));
        

    }

    public static void print(Collection<?> collection){
        for(Object o: collection){
            System.out.println(o);
        }
    }
}
