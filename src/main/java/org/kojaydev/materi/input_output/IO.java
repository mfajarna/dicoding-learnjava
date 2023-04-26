package org.kojaydev.materi.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IO {
    // Input and Output

    // Using Scanner
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukan nilai pertama ");
//        int x = scanner.nextInt();
//        System.out.print("Nilai x = " + x);
//    }

    // Using BufferedReader
    public static void main(String[] args){
        int value = 0;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.println("Masukan angka pertama");
            value = Integer.parseInt(bufferedReader.readLine());
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(value);
    }
}
