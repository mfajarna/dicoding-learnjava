package org.kojaydev.materi.oop.modifer;

public class KelasB extends KelasA {

    @Override
    protected void methodProtected(){
        super.methodProtected();

        System.out.println("Cara memanggil protected dari luar class");
    }

}
