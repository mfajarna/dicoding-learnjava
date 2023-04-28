package org.kojaydev.studikasus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("masukan kalimat ");
        String wordInput = in.nextLine();

        WordCheck wordCheck = new WordCheck(wordInput);

        String word = wordCheck.numCheck();
        System.out.println(word);
    }
}
