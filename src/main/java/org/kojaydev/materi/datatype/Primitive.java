package org.kojaydev.materi.datatype;

public class Primitive {
    // Byte = Nilai minimum dan maksimum dari tipe data ini adalah -128, dan 127
    public byte byteValue = 10, anotherByteValue = -10;

    /* Short Merupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam range menengah,
     yaitu antara -32,768 sampai 32,767. */
    public short shortVal = 20000, anotherShortVal = -20000;

    /*
        int = Merupakan tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam range cukup besar,
        yakni antara -2,147,483,648 sampai 2,147,483,647
     */
    public int intVal = 150000, anotherIntVal = -150000;

    /*
        Long = Merupakan tipe data integer yang lebih besar jika dibandingkan dengan tipe data int.
        Ukurannya 64 bit dan bisa digunakan untuk menyimpan angka dengan range
        antara -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807.
     */
    public long longVal = 1L, anotherLongVal = -20000L;

    /*
        float = Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal.
        Nilai default-nya 0.0f
    */
     public float floatVal = 3.5F;

    /*
       double = Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal.
       Nilai default-nya 0.0f
    */
    public double doubleVal = 3.0;

    /*
       boolean = Merupakan sebuah tipe data yang memiliki 2 (dua) macam nilai,
       yaitu true dan false. Nilai default-nya false.
    */
    public boolean isTrue = true, isFalse = false;

    /*
       char = Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter.
       Nilai karakter tersebut dibungkus di dalam tanda ' '.
    */
    public char charVal = 'A', anotherCharVal = 'B';
}
