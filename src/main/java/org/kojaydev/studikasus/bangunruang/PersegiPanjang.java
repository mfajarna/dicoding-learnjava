package org.kojaydev.studikasus.bangunruang;

public class PersegiPanjang implements BangunDatar{

    public PersegiPanjang(){

    }

    @Override
    public double RumusLuas(int s1, int s2) {
        return (s1 * s2);
    }

    @Override
    public double RumusKeliling(int s1, int s2) {
        return (2 * (s1 + s2));
    }
}
