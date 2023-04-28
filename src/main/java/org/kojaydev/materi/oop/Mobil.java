package org.kojaydev.materi.oop;

public class Mobil {

    private String namaMobil;
    private int harga;
    private boolean keteranganStock;

    // No Args Constructor
//    public Mobil(){
//
//    }

    // Parameter Constructor
    public Mobil(String namaMobil, int harga){
        this.namaMobil = namaMobil;
        this.harga = harga;
    }

    public void setKeteranganStock(Boolean ketStock){
        this.keteranganStock = ketStock;
    }

    public void displaySpec(){
        System.out.println("Nama mobil= " + namaMobil);
        System.out.println("Harga Mobil= " + harga);
        System.out.println("Keterangan Stock = " + (keteranganStock ? "Tersedia": "Habis"));
    }

}
