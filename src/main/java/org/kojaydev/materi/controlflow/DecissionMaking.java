package org.kojaydev.materi.controlflow;

public class DecissionMaking {

    public static void main(String[] args){
        int nilaiUjian = 110;
        char indeksPrestasi = 'E';

        if(nilaiUjian >= 80 && nilaiUjian <= 100){
            indeksPrestasi = 'A';
        } else if (nilaiUjian < 80) {
            indeksPrestasi = 'B';
        }else{
            System.out.println("Indeks tidak ada");
        }

        System.out.println("Indeks Prestasi " + indeksPrestasi);
    }
}
