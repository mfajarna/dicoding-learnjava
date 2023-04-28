package org.kojaydev.studikasus.bangunruang;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang oPersegi;
        Lingkaran oLingkaran;
        int s1, s2, r;

        oPersegi = new PersegiPanjang();
        oLingkaran = new Lingkaran();

        mainMenu();

        switch (pilihan){
            case '1': {
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + oPersegi.RumusLuas(s1, s2));
                System.out.println("Keliling persegi panjang: " + oPersegi.RumusKeliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + oLingkaran.RumusLuas(r));
                System.out.println("Keliling lingkaran: " + oLingkaran.RumusLuas(r));
                break;
            }
            default: {
                System.out.println("Pilihan tidak ada!!");
                break;
            }
        }
    }

    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
