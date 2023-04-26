package org.kojaydev.materi.datatype;

public class NonPrimitive {
    public String name = "Kojaydev";

    char[] nameChar = {'k', 'o', 'j', 'a', 'y'};
    public String stringChar = new String(nameChar);

    String defaultName = "Java Programming";

    // Mengetahui panjang string dengan length();
    public int stringLen = defaultName.length();

    // Mengambil karakter dari sebuah string dengan charAt();
    public char takeChar = stringChar.charAt(3);


}
