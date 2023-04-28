package org.kojaydev.materi.oop.learninheritance;

public class Kucing extends Hewan{

    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat){
        this.ras = ras;
        this.habitat = habitat;
    }



    @Override
    public String toString() {
        return "Kucing{" +
                "ras='" + ras + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }


    public void makan(){ // overiding
        System.out.println("Kucing sedang makan...");
    }

    public void makan(String food){ // overloading
        System.out.println("Kucing makan " + food);
    }

}
