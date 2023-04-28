package org.kojaydev.studikasus.bangunruang;

public class Lingkaran implements BangunDatar {

    private double pi = 3.14;

    public Lingkaran(){

    }

    @Override
    public double RumusLuas(int s1, int s2) {
        return 0;
    }

    @Override
    public double RumusKeliling(int s1, int s2) {
        return 0;
    }

    public double RumusLuas(int r){
        return (pi * r * r);
    }

    public double RumusKeliling(int r){
        return (2 * pi * r);
    }
}
